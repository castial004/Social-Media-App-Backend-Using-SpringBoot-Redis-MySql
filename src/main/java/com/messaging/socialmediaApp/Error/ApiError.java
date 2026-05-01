package com.messaging.socialmediaApp.Error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiError {
    private String error;
    private HttpStatus status;
    private LocalDateTime createdAt;

    ApiError(String error,HttpStatus status){
        this.error = error;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }
}
