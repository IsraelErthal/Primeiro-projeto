package main.java.com.estruturacondicional2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor de um dos lados do triângulo");
        double lado1 = scanner.nextDouble();
        System.out.println("agora do segundo lado");
        double lado2 = scanner.nextDouble();
        System.out.println("Agora do terceiro lado");
        double lado3 = scanner.nextDouble();
        
        if ((lado1 < 0) || (lado2 < 0) || (lado3 < 0)) {
            System.out.println("valor inválido");
        } else if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
            System.out.println("é um triângulo equilátero");
        } else if ((lado1 == lado2) || (lado1 == lado2) || (lado2 == lado3))  {
            System.out.println("é um triângulo isósceles");
        } else
            System.out.println("triângulo escaleno");
    }
}
