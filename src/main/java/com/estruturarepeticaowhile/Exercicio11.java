package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicacao = 1;
        int sair = 1;

        while (sair != 0) {
            System.out.println("Digite um número");
            int numero = scanner.nextInt();
            System.out.println("Digite 0 para sair");
            sair = scanner.nextByte();

            if (numero % 2 == 0 && numero < 20) {
                multiplicacao = multiplicacao * numero;
            }

            System.out.println(multiplicacao);
        }
    }
}