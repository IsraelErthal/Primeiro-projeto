package main.java.com.estruturacondicional;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int valorB = scanner.nextInt();
        int soma = valorA + valorB;
        int subtracao = valorA - valorB;
        int multiplicacao = valorA * valorB;
        double divisao = valorA / valorB;
        System.out.println("A soma é " + soma + " A subtração " + subtracao + " A multiplicação é " + multiplicacao + " A divisão é " + divisao);

    }
}
