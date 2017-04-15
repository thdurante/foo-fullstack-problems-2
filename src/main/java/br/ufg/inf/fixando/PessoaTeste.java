package br.ufg.inf.fixando;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Juliana", 20);

        p.imprime();

        p.fazAniversario();
        p.fazAniversario();
        p.fazAniversario();

        p.imprime();
    }
}
