package br.ufg.inf.fixando;

public class Casa {

    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas() {
        int portasAbertas = 0;

        if (this.porta1.estaAberta()) portasAbertas++;
        if (this.porta2.estaAberta()) portasAbertas++;
        if (this.porta3.estaAberta()) portasAbertas++;

        return portasAbertas;
    }

    public void imprime() {
        System.out.println("Casa na cor: " + this.cor);
        System.out.println("Portas abertas: " + this.quantasPortasEstaoAbertas());
    }
}
