package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int numero3 = scanner.nextInt();
        if (numero1>numero2 && numero1>numero3) {
            System.out.println("O maior é " + numero1);
        } else if (numero2>numero1 && numero2>numero3) {
            System.out.println("O maior é " + numero2);
        } else if (numero3>numero1 && numero3>numero2) {
            System.out.println("O maior é " + numero3);
        }else {
            System.out.println("Os números são iguais");
    }
    }
}
