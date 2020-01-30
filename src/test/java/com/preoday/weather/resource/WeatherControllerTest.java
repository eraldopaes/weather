package com.preoday.weather.resource;

import com.preoday.weather.dto.WeatherDTO;
import com.preoday.weather.service.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.HttpStatus;

import java.math.BigDecimal;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WeatherControllerTest {

    @InjectMocks
    private WeatherController weatherController;

    @Mock
    private WeatherService weatherService;

    @Test
    @DisplayName("Deve retornar a média da temperatura dos SOLs")
    void should_return_sols_average() throws JSONException {

        when(weatherService.getWeather(null)).thenReturn(new WeatherDTO(BigDecimal.ONE));

        WeatherDTO response = given()
                .standaloneSetup(weatherController)
                .log().all()
                .when()
                .get("/nasa/temperature")
                .then()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(WeatherDTO.class);

        verify(weatherService, times(1)).getWeather(null);
        Assertions.assertEquals(BigDecimal.ONE, response.getAverageTemperature());
    }

    @Test
    @DisplayName("Deve retornar a média da temperatura do SOL específico")
    void should_return_sol_average() throws JSONException {

        when(weatherService.getWeather("410")).thenReturn(new WeatherDTO(BigDecimal.ONE));

        WeatherDTO response = given()
                .standaloneSetup(weatherController)
                .log().all()
                .when()
                .get("/nasa/temperature?SOL=410")
                .then()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(WeatherDTO.class);

        verify(weatherService, times(1)).getWeather("410");
        Assertions.assertEquals(BigDecimal.ONE, response.getAverageTemperature());
    }
}