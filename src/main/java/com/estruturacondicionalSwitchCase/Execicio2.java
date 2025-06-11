package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Execicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Digite um número");
        double n1 = scanner.nextDouble();
        System.out.println("Digite outro número");
        double n2 = scanner.nextDouble();
        System.out.println("Escolha um operação básica");
        String operacao = scanner.next();

        switch (operacao) {
            case "Adição":
                System.out.println("O resultado é " + (n1 + n2) );
            break;

            case "Subtração":
                System.out.println("O resultado é " + (n1 - n2));
            break;

            case "Multiplicação":
                System.out.println("O resultado é " + (n1 * n2 ));
            break;

            case "Divisão":
                System.out.println("O resultado é " + (n1/n2));
            break;

            default:
                System.out.println("operação inválida");

        }

    }
}
