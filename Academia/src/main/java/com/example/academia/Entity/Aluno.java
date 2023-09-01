package com.example.academia.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Aluno {
    private int codigo;
    private String nome;
    private double peso;
    private int idade;
    private long cpf;
    private Administracao matricula;
}
