package com.example.academia.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Administracao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula;
    private Date inicio;
    private boolean mensalidade;
    @ManyToOne
    @JoinColumn(name = "aluno")
    private Aluno nome;

    public int getMatricula() {
        return matricula;
    }

    public Date getInicio() {
        return inicio;
    }

    public boolean isMensalidade() {
        return mensalidade;
    }

    public Aluno getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setMensalidade(boolean mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void setNome(Aluno nome) {
        this.nome = nome;
    }
}
