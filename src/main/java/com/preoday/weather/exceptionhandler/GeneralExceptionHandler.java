package com.preoday.weather.exceptionhandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;

@Order(Ordered.LOWEST_PRECEDENCE)
@RestControllerAdvice
public class GeneralExceptionHandler {

    private final PreodayExceptionHandler preodayExceptionHandler;

    @Autowired
    public GeneralExceptionHandler(PreodayExceptionHandler preodayExceptionHandler) {
        this.preodayExceptionHandler = preodayExceptionHandler;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> handlerInternalServerError(Exception e, Locale locale) {
        final String errorCode = "fatal-error";
        final HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        final ApiErrorResponse apiErrorResponse = ApiErrorResponse.of(status, preodayExceptionHandler.toApiError(errorCode, locale));
        return ResponseEntity.status(status).body(apiErrorResponse);
    }
}
