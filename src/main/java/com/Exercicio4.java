package main.java.com;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        System.out.println("para descobrir a área de um triângulo, digite o valor de sua base:");
        double valorBase = scanner.nextDouble();

        System.out.println("Agora digite sua altura: ");
        double valorAltura = scanner.nextDouble();
        double valorArea = valorBase * valorAltura / 2;


        System.out.println("A área do triângulo é: " + valorArea);
    }
}
