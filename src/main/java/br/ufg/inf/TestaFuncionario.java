package br.ufg.inf;

import br.ufg.inf.models.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Danilo");
        f1.setSalario(100);

        Funcionario f2 = f1;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
