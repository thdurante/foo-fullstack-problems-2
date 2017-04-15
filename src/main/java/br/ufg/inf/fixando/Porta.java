package br.ufg.inf.fixando;

public class Porta {

    private boolean aberta;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    private String cor;

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public void imprime() {
        System.out.println("Porta com dimensões [X: " + this.dimensaoX + ", Y: " + this.dimensaoY + ", Z: " + this.dimensaoZ + "]");
        System.out.println("Cor: " + this.cor);
        System.out.println("Está aberta: " + this.estaAberta());
    }
}
