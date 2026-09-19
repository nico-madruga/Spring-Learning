package br.com.comofazisso.aprendendoafazerisso.exceptions;

public class UsuarioNotFound extends RuntimeException
{
    public UsuarioNotFound(String message) {
        super(message);
    }
}
