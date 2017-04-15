package br.ufg.inf.fixando;

public class PortaTeste {

    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.abre();
        porta.imprime();

        System.out.println("\n");
        porta.pinta("Vermelho");
        porta.imprime();

        System.out.println("\n");
        porta.pinta("Verde");
        porta.imprime();

        System.out.println("\n");
        porta.setDimensaoX(1.2);
        porta.setDimensaoY(2.5);
        porta.setDimensaoZ(0.3);
        porta.imprime();

        System.out.println("\n");
        porta.fecha();
        porta.imprime();
    }
}
