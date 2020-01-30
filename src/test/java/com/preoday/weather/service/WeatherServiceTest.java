package com.preoday.weather.service;

import com.preoday.weather.dto.WeatherDTO;
import com.preoday.weather.exceptionhandler.BusinessException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.HttpStatus;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WeatherServiceTest {

    @InjectMocks
    private WeatherService weatherService;

    @Mock
    private NasaRestClient nasaRestClient;

    @Test
    @DisplayName("Deve calcular a média de todos os SOLs disponíveis quando nenhum SOL é passado como paramentro")
    public void should_calculate_average_of_all_sol() throws JSONException {

        when(nasaRestClient.find()).thenReturn(Enviroment.getWeatherFull());

        WeatherDTO weather = weatherService.getWeather(null);

        verify(nasaRestClient, times(1)).find();
        assertEquals(new BigDecimal("-84.19"), weather.getAverageTemperature());
    }

    @Test
    @DisplayName("Deve retornar a média do SOL passado como paramentro")
    public void should_return_average_of_sol() throws JSONException {

        when(nasaRestClient.find()).thenReturn(Enviroment.getWeatherFull());

        WeatherDTO weather = weatherService.getWeather("413");

        verify(nasaRestClient, times(1)).find();
        assertEquals(new BigDecimal("-79.92"), weather.getAverageTemperature());
    }

    @Test
    @DisplayName("Deve lançar exception quando o SOL passado como paramentro não existe")
    public void should_throw_exception_sol_not_found() throws JSONException {

        when(nasaRestClient.find()).thenReturn(Enviroment.getWeatherFull());

        BusinessException businessException = assertThrows(BusinessException.class,
                () -> weatherService.getWeather("123456"));

        verify(nasaRestClient, times(1)).find();
        assertEquals("weather.not-found", businessException.getErrorCode());
        assertEquals(HttpStatus.BAD_REQUEST, businessException.getStatus());
    }

    @Test
    @DisplayName("Deve lançar exception quando nenhum SOL é retornado")
    public void should_throw_exception_when_zero_sol_returned() throws JSONException {

        when(nasaRestClient.find()).thenReturn(Enviroment.getWeatherNoSol());

        BusinessException businessException = assertThrows(BusinessException.class,
                () -> weatherService.getWeather(null));

        verify(nasaRestClient, times(1)).find();
        assertEquals("weather.sols-not-found", businessException.getErrorCode());
        assertEquals(HttpStatus.BAD_REQUEST, businessException.getStatus());
    }
}