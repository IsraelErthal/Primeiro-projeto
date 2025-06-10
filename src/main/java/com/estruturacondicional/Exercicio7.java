package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio7 {
    public static final int INFANTIL = 10;
    public static final int JUVENIL = 17;
    public static final int ADULTO = 18;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para descobrir sua categoria, digite sua idade!");
        int idade = scanner.nextInt();
        if (idade < 6) {
            System.out.println("Categoria não registrada");
        } else if (idade < INFANTIL) {
            System.out.println("Categoria Infantil!");
        } else if (idade < JUVENIL) {
            System.out.println("Categoria Juvenil");
        } else if (idade >= ADULTO) {
            System.out.println("Categoria Adulto");
        }
    }
}
