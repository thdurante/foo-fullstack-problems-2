package br.ufg.inf.fixando;

public class CasaTeste {

    public static void main(String[] args) {
        Casa casa = new Casa();

        casa.setPorta1(new Porta());
        casa.setPorta2(new Porta());
        casa.setPorta3(new Porta());

        casa.pinta("Branco");
        casa.imprime();

        System.out.println("\n");
        casa.getPorta1().abre();
        casa.imprime();

        System.out.println("\n");
        casa.getPorta2().abre();
        casa.getPorta3().abre();
        casa.imprime();

        System.out.println("\n");
        casa.getPorta3().fecha();
        casa.imprime();
    }
}
