package main.java.com;

import java.util.Scanner;

public class Potência {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("o resultado da potência é ");
        System.out.println(primeiroNumero * primeiroNumero );
    }
}
