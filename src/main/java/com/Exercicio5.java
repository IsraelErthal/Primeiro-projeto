package main.java.com;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo Número: ");
        int numero2 = scanner.nextInt();

        System.out.println("O valor da divisão é: " + numero1 / numero2);
        System.out.println("O resto da divisão é: " + numero1 % numero2);

    }
}
