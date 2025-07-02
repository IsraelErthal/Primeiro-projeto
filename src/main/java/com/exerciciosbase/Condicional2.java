package main.java.com.exerciciosbase;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero para o contador");
        int numero = scanner.nextInt();
        int contador = 0;
        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }
    }
}
