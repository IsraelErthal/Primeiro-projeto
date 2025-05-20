package main.java.com;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para saber a soma de segundos que existem em dias, horas, minutos e segundos, digite primeiramente a quantidade de dias!");
        int numeroDias = scanner.nextInt();

        System.out.println("Digite o números de horas!");
        int numeroHoras = scanner.nextInt();

        System.out.println("Digite o número de minutos");
        int numeroMinutos = scanner.nextInt();

        System.out.println("Digite o número de segundos!");
        int numerosSegundos = scanner.nextInt();

        int resultadoDias = (numeroDias * 24) * 60 * 60;
        int resultadoHoras = (numeroHoras * 60) * 60;
        int resultadoMinutos = numeroMinutos * 60;
        int resultadoGeral = resultadoDias + resultadoHoras + resultadoMinutos + numerosSegundos;

        System.out.println("O resultado é: " + resultadoGeral);

    }
}
