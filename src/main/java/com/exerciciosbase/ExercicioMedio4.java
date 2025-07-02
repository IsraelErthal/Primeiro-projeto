package main.java.com.exerciciosbase;

import java.util.Scanner;

public class ExercicioMedio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem vindo! Digite o seu nome.");
        String nome = scanner.next();
        System.out.println("Agora, digite seu peso em KG");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        System.out.println(nome + " Seu IMC é de " + peso / (altura * altura));
    }
}
