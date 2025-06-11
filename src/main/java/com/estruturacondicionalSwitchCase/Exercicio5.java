package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em real para converte-lo");
        double real = scanner.nextDouble();
        System.out.println("Para qual moeda quer converte-lo");
        String moeda = scanner.next();

        switch (moeda) {
            case "dólar":
                System.out.println("O valor em dólar é " + (real / 5.57));
            break;

            case "Euro":
                System.out.println("O valor em euro é " + (real / 6.37));
            break;

            case "Libra":
                System.out.println("O valor em libras é " + (real / 7.52));
            break;

            case "peso":
                System.out.println("O valor em peso argentino é " + (real / 0.047));
            break;

            default:
                System.out.println("Moeda não cadastrada");
        }
    }
}
