package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPares = 0;
        int contador = 0;
        while (contador < 10) {
            System.out.println("digite numero");
            double numero = scanner.nextDouble();
            contador = contador + 1;
            if (numero % 2 == 0) {
                somaPares = somaPares + numero;
            }
        }
        System.out.println("A soma de números pares é " + somaPares);
    }
}
