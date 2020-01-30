package com.preoday.weather.service;

import com.preoday.weather.exceptionhandler.BusinessException;
import com.preoday.weather.property.NasaAPIProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class NasaRestClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(NasaRestClient.class);

    private final RestTemplate restTemplate;
    private final NasaAPIProperty nasaAPIProperty;

    @Autowired
    public NasaRestClient(RestTemplate restTemplate, NasaAPIProperty nasaAPIProperty) {
        this.restTemplate = restTemplate;
        this.nasaAPIProperty = nasaAPIProperty;
        LOGGER.info("key: " + nasaAPIProperty.getApiKey());
    }

    public String find() {
        URI uri = UriComponentsBuilder
                .fromHttpUrl(nasaAPIProperty.getBaseUrl())
                .path(nasaAPIProperty.getPath())
                .queryParam("api_key", nasaAPIProperty.getApiKey())
                .queryParam("feedtype", "json")
                .queryParam("ver", "1.0")
                .buildAndExpand()
                .toUri();
        RequestEntity<Void> body = RequestEntity.get(uri).build();
        return doRequest(body, String.class);
    }

    private <T> T doRequest(RequestEntity<?> requestEntity, Class<T> responseType) {
        HttpStatus statusCode;
        try {
            ResponseEntity<T> response = restTemplate.exchange(requestEntity, responseType);
            statusCode = response.getStatusCode();

            if (statusCode.is2xxSuccessful()) {
                return response.getBody();
            }
        } catch (HttpClientErrorException e) {
            statusCode = e.getStatusCode();
        }

        LOGGER.error("Ocorreu um erro na requisição {}, status {}. Detalhes: {}", requestEntity.getUrl(), statusCode, requestEntity);
        throw new BusinessException("Erro na requisição ao serviço de clima da nasa");
    }
}
