package dev.leandromoraes.paymentapi.presentation.handler;

import dev.leandromoraes.paymentapi.infrastructure.logger.Logger5w1hBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleException(Exception ex) {

        Logger5w1hBuilder.create(GlobalExceptionHandler.class)
                .where("GlobalExceptionHandler")
                .what("unexpected_error")
                .why("unhandled_exception")
                .who("system")
                .how("exception handling")
                .error(ex);

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of(
                        "message", "Unexpected error",
                        "timestamp", LocalDateTime.now()
                ));
    }
}
