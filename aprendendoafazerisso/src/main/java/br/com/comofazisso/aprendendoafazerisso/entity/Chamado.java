package br.com.comofazisso.aprendendoafazerisso.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chamado
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private String status;

    @Column(name = "prioridade")
    private String prioridade;

    @Column(name = "data_abertura")
    private LocalDateTime dataAbertura;

    public Chamado()
    {
        this.id = null;
        this.titulo = null;
        this.descricao = null;
        this.status = null;
        this.prioridade = null;
        this.dataAbertura = null;
    }

    public Chamado(Long id, String titulo, String descricao, String status, String prioridade, LocalDateTime dataAbertura)
    {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
        this.dataAbertura = dataAbertura;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getPrioridade()
    {
        return prioridade;
    }

    public void setPrioridade(String prioridade)
    {
        this.prioridade = prioridade;
    }

    public LocalDateTime getDataAbertura()
    {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura)
    {
        this.dataAbertura = dataAbertura;
    }
}
