package main.java.com.exerciciosbase;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número!");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número!");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("A soma dos números é: " + soma +
                " A subtração é: " + subtracao +
                " A multiplicação é: " + multiplicacao +
                " A divisão é " + divisao);
    }
}
