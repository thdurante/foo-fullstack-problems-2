package br.ufg.inf.models;

public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private boolean estaNaEmpresa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    /*
    * Outros métodos
    * */

    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    public double calculaGanhoAnual() {
        return  this.salario * 12;
    }

    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Ganho anual: " + this.calculaGanhoAnual());
        System.out.println("Data de entrada: " + this.dataEntrada.getDia() + "/" + this.dataEntrada.getMes() + "/" + this.dataEntrada.getAno());
    }
}
