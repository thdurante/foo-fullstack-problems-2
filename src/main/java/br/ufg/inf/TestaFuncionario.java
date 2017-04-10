package br.ufg.inf;

import br.ufg.inf.models.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("Hugo");
        f1.setSalario(100);
        f1.recebeAumento(50);

        System.out.println("salario atual:" + f1.getSalario());
        System.out.println("ganho anual:" + f1.calculaGanhoAnual());
    }
}
