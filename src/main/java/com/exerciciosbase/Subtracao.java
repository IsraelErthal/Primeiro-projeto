package main.java.com.exerciciosbase;

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o pimeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scanner.nextDouble();

        System.out.println("o resultado da subtração é ");
        System.out.println(primeiroNumero - segundoNumero);
    }
}
