package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = scanner.nextDouble();
        if (numero1 > numero2) {
            System.out.println("O maior é " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior é " + numero2);
        } else {
            System.out.println("Os Números são iguais!");
        }
        // outra forma de fazer
        // Operador ternario: (numero1 > numero2) ? numero1 : numero2;
    }
}
