package br.com.comofazisso.aprendendoafazerisso.dto;

import org.springframework.http.HttpStatus;

import javax.net.ssl.HttpsURLConnection;

public record ExceptionResponse(
        HttpStatus status,
        String message
) {
}
