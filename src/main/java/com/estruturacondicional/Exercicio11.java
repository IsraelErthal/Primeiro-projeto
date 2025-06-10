package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de cópias");
        int copias = scanner.nextInt();
        if (copias <= 0) {
            System.out.println("Número inválido");
        } else if (copias < 11) {
            System.out.println("O valor é R$" + copias * 0.10);
        } else if (copias <= 50) {
            System.out.println("O valor é R$" + copias * 0.08);
        } else if (copias > 50) {
            System.out.println("O valor é R$" + copias * 0.05);
        }
    }
}
