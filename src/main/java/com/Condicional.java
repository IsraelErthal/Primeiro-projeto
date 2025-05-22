package main.java.com;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        if (numero > 0) System.out.println("Esse número é positivo");
        else if (numero < 0) System.out.println("Esse número é negativo");
        else System.out.println("Esse número é zero");
    {
        }
    }
}
