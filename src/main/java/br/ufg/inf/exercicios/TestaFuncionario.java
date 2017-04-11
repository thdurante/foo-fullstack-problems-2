package br.ufg.inf.exercicios;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Danilo");
        f1.setSalario(100);
        f1.setDataEntrada(new Data(2, 1, 2005));

        f1.mostra();
    }
}
