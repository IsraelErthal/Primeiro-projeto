package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int valorA = scanner.nextInt();

        System.out.println("Digite o valor de B");
        int valorB = scanner.nextInt();

        int contador = 0;
        int resultado = 1;

        while(contador < valorB) {

            resultado *= valorA;
            contador++;
        }
        System.out.println(resultado);

    }
}
