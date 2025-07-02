package main.java.com.estruturarepeticaowhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sair = 0;
        int numeros = 0;
        int contador = 0;
        int totalNumeros = 0;
        while (sair != 3) {
            System.out.println("Digite os números");
            numeros = scanner.nextInt();
            totalNumeros = totalNumeros + numeros;
            contador = contador +1;
            System.out.println("3 para sair");
            sair = scanner.nextInt();
        }
        double media = totalNumeros / contador;
        System.out.println("A média é " + media);
    }
}
