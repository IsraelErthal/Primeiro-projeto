package main.java.com;

import java.util.Scanner;

public class ExercicioMedio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("você quer saber o valor que cada pessoa deve pagar? Se sim, digite o valor total da conta");
        double valorConta = scanner.nextDouble();
        System.out.println("Agora digite o número de pessoas");
        int pessoas = scanner.nextInt();
        System.out.println("O valor que cada um deve pagar é R$" + valorConta/pessoas);
    }
}
