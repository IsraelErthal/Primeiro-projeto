package main.java.com.exerciciosbase;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para descobrir o valor de Y digite o valor de X");
        int valorDeX = scanner.nextInt();
        int valorDeY = 3 * valorDeX + 2;

        System.out.println("O valor de Y é igual a: " + valorDeY );
    }
}
