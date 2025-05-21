package main.java.com;

import java.util.Scanner;

public class ExercicioMedio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo! Digite o seu nome");
        String nome = scanner.next();
        System.out.println("Digite o seu salário atual");
        double salario = scanner.nextDouble();
        System.out.println("Digite o percentual de reajuste");
        double percentual = scanner.nextDouble();
        double salarioReajustado = salario + (salario * percentual / 100);
        System.out.println("Seu salário reajustado é de: R$"+ salarioReajustado);
    }
}
