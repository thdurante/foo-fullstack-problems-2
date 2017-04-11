package br.ufg.inf.exercicios;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String dataFormatada() {
        return String.format("%02d", this.dia) + "/" + String.format("%02d", this.mes) + "/" + this.ano;
    }
}
