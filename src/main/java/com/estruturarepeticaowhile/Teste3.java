package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalNotas = 0;
        double nota = 0;
        int contador = 0;
        int sairSistema = 0;

        while (sairSistema != 3) {
            System.out.println("Digite a nota");
            nota = scanner.nextDouble();
            totalNotas = totalNotas + nota;
            contador = contador + 1;
            System.out.println("Digite 3 para sair");
            sairSistema = scanner.nextInt();
        }
        double media = totalNotas / contador;
        System.out.println("A média é " + media);
    }
}
