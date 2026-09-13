package br.com.comofazisso.aprendendoafazerisso.entity;

import jakarta.persistence.*;
import jdk.jfr.Timespan;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Interacao
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "data")
    private LocalDateTime data;

    @OneToMany
    @JoinColumn(name = "chamado")
    private List<Chamado> chamados;

    @OneToMany
    @JoinColumn(name = "tecnico")
    private List<Tecnico> tecnicos;
}
