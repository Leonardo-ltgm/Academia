package com.example.academia.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private double peso;
    private int idade;
    private long cpf;
    @ManyToOne
    private Administracao matricula;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public long getCpf() {
        return cpf;
    }

    public Administracao getMatricula() {
        return matricula;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(Administracao matricula) {
        this.matricula = matricula;
    }
}
