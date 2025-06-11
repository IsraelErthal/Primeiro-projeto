package main.java.com.estruturacondicional2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor para saque");
        int saque = scanner.nextInt();

        System.out.println("A quantidade de cedulas de 100 é " + saque/100);
        System.out.println("A quantidade de cedulas de 50 é " + saque/50);
        System.out.println("A quantidade de cedulas de 20 é " + saque/20);
        System.out.println("A quantidade de cedulas de 10 é " + saque/10);
        System.out.println("A quantidade de cedulas de 5 é " + saque/5);
        System.out.println("A quantidade de cedulas de 2 é " + saque/2);
        System.out.println("A quantidade de cedulas de 1 é " + saque);

        if (saque < 10) {
            System.out.println("Valor inválido");
        } else if (saque > 1000) {
            System.out.println("Valor inválido");
        }


    }
}
