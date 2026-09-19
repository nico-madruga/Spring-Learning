package br.com.comofazisso.aprendendoafazerisso.exceptions;

import br.com.comofazisso.aprendendoafazerisso.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(UsuarioNotFound.class)
    public ResponseEntity<?> handleUsuarioNotFound(UsuarioNotFound ex){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ExceptionResponse(HttpStatus.NOT_FOUND, ex.getMessage()));
    }
}
