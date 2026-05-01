package com.messaging.socialmediaApp.Error;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Global_Exception_Handler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ApiError> entityDoesNotExists(EntityNotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiError(exception.getMessage(), HttpStatus.NOT_FOUND));
    }
    @ExceptionHandler(EntityExistsException.class)
    public ResponseEntity<ApiError> entityDoesNotExists(EntityExistsException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiError(exception.getMessage(), HttpStatus.NOT_FOUND));
    }

}
