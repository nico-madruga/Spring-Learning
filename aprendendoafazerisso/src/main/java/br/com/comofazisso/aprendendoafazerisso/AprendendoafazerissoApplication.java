package br.com.comofazisso.aprendendoafazerisso;

import br.com.comofazisso.aprendendoafazerisso.entity.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AprendendoafazerissoApplication
{
	public static void main(String[] args) {
		SpringApplication.run(AprendendoafazerissoApplication.class, args);
	}
	Usuario userData = new Usuario();

}
