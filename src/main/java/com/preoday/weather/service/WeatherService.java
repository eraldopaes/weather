package com.preoday.weather.service;

import com.preoday.weather.dto.WeatherDTO;
import com.preoday.weather.exceptionhandler.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class WeatherService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);

    public static final String AVERAGE = "av";
    public static final String SOL_KEYS = "sol_keys";
    public static final String ATMOSPHERIC_TEMPERATURE = "AT";

    private final NasaRestClient nasaRestClient;

    @Autowired
    public WeatherService(NasaRestClient nasaRestClient) {
        this.nasaRestClient = nasaRestClient;
    }

    public WeatherDTO getWeather(String solId) throws JSONException {

        String weatherObjectResponse = nasaRestClient.find();
        JSONObject jsonWeatherObjectResponse = new JSONObject(weatherObjectResponse);
        List<String> solIds = getSolIds(jsonWeatherObjectResponse);
        if (isNull(solId)) {
            BigDecimal average = calculateAverage(jsonWeatherObjectResponse, solIds);
            LOGGER.info("Atmospheric temperature average in celsius degrees: {}", average);
            return new WeatherDTO(convertToFahrenheit(average));
        }

        verifyId(solIds, solId);
        double solATAv = getSolAtmosphericTemperatureAverage(jsonWeatherObjectResponse, solId);
        LOGGER.info("Atmospheric temperature average in celsius degrees: {}", solATAv);

        return new WeatherDTO(convertToFahrenheit(new BigDecimal(solATAv)));
    }

    private BigDecimal calculateAverage(JSONObject jsonWeatherObjectResponse, List<String> solIds) {

        if (solIds.isEmpty()) {
            LOGGER.error("Nenhum SOL foi retornado na chamada da API");
            throw new BusinessException("weather.sols-not-found");
        }

        BigDecimal total = solIds
                .stream()
                .map(solId -> {
                    try {
                        double solATAv = getSolAtmosphericTemperatureAverage(jsonWeatherObjectResponse, solId);
                        return new BigDecimal(solATAv);
                    } catch (JSONException e) {
                        LOGGER.error("Ocorreu um erro inesperado durante o cálculo da média. Detalhes: {}", e.getMessage());
                        throw new BusinessException("weather.calculate-error");
                    }
                })
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);

        return total.divide(new BigDecimal(solIds.size()), RoundingMode.HALF_EVEN);
    }

    private double getSolAtmosphericTemperatureAverage(JSONObject jsonWeatherObjectResponse, String solId) throws JSONException {
        JSONObject solJsonObject = jsonWeatherObjectResponse.getJSONObject(solId);
        JSONObject at = solJsonObject.getJSONObject(ATMOSPHERIC_TEMPERATURE);
        return at.getDouble(AVERAGE);
    }

    private List<String> getSolIds(JSONObject jsonWeatherObjectResponse) throws JSONException {
        JSONArray at = jsonWeatherObjectResponse.getJSONArray(SOL_KEYS);
        List<String> solIds = new ArrayList<>();
        for (int i = 0; i < at.length(); i++) {
            solIds.add((String) at.get(i));
        }
        return solIds;
    }

    private void verifyId(List<String> solIds, String solId) {
        if (!solIds.contains(solId)) {
            LOGGER.error("Não existe SOL com o parametro igual a {}", solId);
            throw new BusinessException("weather.not-found");
        }
    }

    private BigDecimal convertToFahrenheit(BigDecimal tempCelsius) {
        // fahrenheit = [(9/5) x celsius] + 32
        return (new BigDecimal("1.8").multiply(tempCelsius)).add(new BigDecimal(32)).setScale(2, RoundingMode.HALF_EVEN);
    }
}
