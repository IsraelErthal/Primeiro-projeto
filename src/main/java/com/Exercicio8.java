package main.java.com;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para saber a média de 3 números, digite o primeiro número");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número");
        double numero3 = scanner.nextDouble();
        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos números é " + media);
    }
}
