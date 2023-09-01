package com.example.academia.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Administracao {
    private int matricula;
    private Date inicio;
    private boolean mensalidade;
    private Aluno nome;
}
