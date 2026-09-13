package br.com.comofazisso.aprendendoafazerisso.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
public class Tecnico
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "especialidade")
    private String especialidade;

    public Tecnico()
    {
        this.id = null;
        this.nome = null;
        this.email = null;
        this.especialidade = null;
    }

    public Tecnico(Long id, String nome, String email, String especialidade)
    {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.especialidade = especialidade;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEspecialidade()
    {
        return especialidade;
    }

    public void setEspecialidade(String especialidade)
    {
        this.especialidade = especialidade;
    }
}
