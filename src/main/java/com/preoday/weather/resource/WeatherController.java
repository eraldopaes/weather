package com.preoday.weather.resource;

import com.preoday.weather.dto.WeatherDTO;
import com.preoday.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    // Foi pedido um Integer, mas achei mais conveniente passar uma String. Nesse caso não parece fazer diferença alguma
    @GetMapping("/nasa/temperature")
    public ResponseEntity<WeatherDTO> find(@RequestParam(value = "SOL", required = false) String solId) throws JSONException {
        WeatherDTO weatherDTO = weatherService.getWeather(solId);
        return ResponseEntity.ok(weatherDTO);
    }
}
