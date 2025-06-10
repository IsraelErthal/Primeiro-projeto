package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();
        if ((n1 == 0) || (n2 == 0)) {
            System.out.println("Z");
        }
        if ((n1 > 0 && n2 > 0)) {
            System.out.println("M");
        } else if ((n1 < 0) && (n2 < 0)) {
            System.out.println("M");
        }
        if ((n1 < 0) && (n2 > 0)) {
            System.out.println("O");
        } else if ((n1 > 0) && (n2 <0)) {
            System.out.println("O");
        }
    }
}
