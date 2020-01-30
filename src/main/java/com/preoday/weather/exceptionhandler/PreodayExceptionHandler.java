package com.preoday.weather.exceptionhandler;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PreodayExceptionHandler {

    private static final String NO_MESSAGE_AVAILABLE = "No message available";

    private final MessageSource apiErrorMessageSource;

    public PreodayExceptionHandler(MessageSource apiErrorMessageSource) {
        this.apiErrorMessageSource = apiErrorMessageSource;
    }

    @ExceptionHandler({BusinessException.class})
    public ResponseEntity<ApiErrorResponse> handleBusinessException(BusinessException e, Locale locale) {
        final ApiErrorResponse apiErrorResponse = ApiErrorResponse.of(e.getStatus(), toApiError(e.getErrorCode(), locale));
        return ResponseEntity.badRequest().body(apiErrorResponse);
    }

    public ApiErrorResponse.ApiError toApiError(String code, Locale locale, Object... args) {

        String message;
        try {
            message = apiErrorMessageSource.getMessage(code, args, locale);
        } catch (NoSuchMessageException e) {
            message = NO_MESSAGE_AVAILABLE;
        }

        return new ApiErrorResponse.ApiError(code, message);
    }
}
