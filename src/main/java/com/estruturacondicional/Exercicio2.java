package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é ímpar");
        }
    }
}
