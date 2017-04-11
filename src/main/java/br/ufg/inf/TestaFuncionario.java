package br.ufg.inf;

import br.ufg.inf.models.Data;
import br.ufg.inf.models.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Danilo");
        f1.setSalario(100);
        f1.setDataEntrada(new Data(12, 01, 2005));

        f1.mostra();
    }
}
