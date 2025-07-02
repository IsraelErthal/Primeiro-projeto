package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        int contador = 0;

        while (contador < 10) {
            contador ++;
            numero = numero + 1;

            System.out.println(numero);




        }

    }
}
