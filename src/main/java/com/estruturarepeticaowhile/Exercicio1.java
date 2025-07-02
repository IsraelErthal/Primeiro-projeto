package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sair = 0;
        int contador = 0;
        while (sair != 3) {
            System.out.println("Digite os nomes dos alunos");
            String nome = scanner.next();
            contador = contador + 1;
            System.out.println("Digite 3 para sair");
            sair = scanner.nextByte();
        }
        System.out.println("o número de alunos é " + contador);
    }
}
