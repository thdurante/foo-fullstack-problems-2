package br.ufg.inf.desafios;

public class TestaFibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.print(resultado);
            if (i != 6) System.out.print(", ");
        }
    }
}
