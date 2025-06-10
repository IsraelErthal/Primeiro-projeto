package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("Numero inválido");
        } else if (numero > 999) {
            System.out.println("Número inválido");
        } else if (numero < 10) {
            System.out.println("É uma unidade");
        } else if (numero < 100) {
            System.out.println("É uma dezena");
        } else if (numero >= 100) {
            System.out.println("É uma centena");
        }
    }
}
