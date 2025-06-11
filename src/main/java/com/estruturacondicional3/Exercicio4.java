package main.java.com.estruturacondicional3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Você é estudante?");
        String estudante = scanner.next();

        if (idade <= 6 || idade > 65) {
            System.out.println("isento");
        } else if (idade <= 25 && estudante.equalsIgnoreCase("sim")) {
            System.out.println("A tarifa é R$ " );

        }
    }
}
