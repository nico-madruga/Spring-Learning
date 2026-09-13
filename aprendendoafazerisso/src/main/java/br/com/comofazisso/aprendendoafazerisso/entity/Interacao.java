package br.com.comofazisso.aprendendoafazerisso.entity;

import jakarta.persistence.*;
import jdk.jfr.Timespan;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
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

    public Interacao()
    {
        this.id = null;
        this.mensagem = null;
        this.data = null;
        this.chamados = null;
        this.tecnicos = null;
    }

    public Interacao(Long id, String mensagem, LocalDateTime data, List<Chamado> chamados, List<Tecnico> tecnicos)
    {
        this.id = id;
        this.mensagem = mensagem;
        this.data = data;
        this.chamados = chamados;
        this.tecnicos = tecnicos;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData()
    {
        return data;
    }

    public void setData(LocalDateTime data)
    {
        this.data = data;
    }

    public List<Chamado> getChamados()
    {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados)
    {
        this.chamados = chamados;
    }

    public List<Tecnico> getTecnicos()
    {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos)
    {
        this.tecnicos = tecnicos;
    }
}
