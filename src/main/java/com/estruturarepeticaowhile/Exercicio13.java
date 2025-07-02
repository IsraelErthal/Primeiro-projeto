package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a razão da PG:");
        int razao = scanner.nextInt();

        System.out.println("Digite o primeiro termo da PG:");
        int termo = scanner.nextInt();

        int contador = 1;

        System.out.println("Os 10 primeiros termos da PG são:");
        while (contador <= 10) {
            System.out.println(termo);
            termo = termo * razao;
            contador++;
        }
    }
}
