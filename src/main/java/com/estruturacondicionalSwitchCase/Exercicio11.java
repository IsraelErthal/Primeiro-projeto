package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção");
        int opcao = scanner.nextInt();
        double saldo = 1500.00;

        switch (opcao) {
            case 1:
                System.out.println("seu saldo é " + saldo);
            break;

            case 2:
                System.out.println("Sacar dinheiro");
            break;

            case 3:
                System.out.println("Depositar o dinheiro");
            break;

            case 4:
                System.out.println("Sair");
            break;
            default:
                System.out.println("digito inválido");
        }
    }
}
