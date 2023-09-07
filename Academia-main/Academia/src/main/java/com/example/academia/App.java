package com.example.academia;

import com.example.academia.Entity.Aula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main (String[] args){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName "aula_jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Aula aula = new Aula();
        aula.setAula("Malhacao");
        aula.setTurno("Matutino");

        entityManager.merge(aula);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("malhacao");
    }
}
