package main.java.com.exerciciosbase;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para saber o valor da equação digite o valor de A");
        double valorA = scanner.nextDouble();

        System.out.println("Digite o valor de B");
        double valorB = scanner.nextDouble();

        System.out.println("Digite o valor de C");
        double valorC = scanner.nextDouble();
        double resultadoEquacao = ((valorB * valorB) - (4 * valorC * valorA)) / (2 * valorA);

        System.out.println("O valor da equação é " + resultadoEquacao);
    }
}
