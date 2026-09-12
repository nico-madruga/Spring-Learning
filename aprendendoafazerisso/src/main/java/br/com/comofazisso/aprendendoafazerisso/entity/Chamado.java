package br.com.comofazisso.aprendendoafazerisso.entity;


import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chamado
{
    private Long id;
    private String titulo;
    private String descricao;
    private String status;
    private String prioridade;
    private LocalDateTime data_abertura;

}
