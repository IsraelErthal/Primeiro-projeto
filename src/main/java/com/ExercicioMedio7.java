package main.java.com;

import java.util.Scanner;

public class ExercicioMedio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para descobrir a média ponderada de um aluno, comece digitando a primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Qual o peso da nota?");
        double peso1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Qual o peso da nota?");
        double peso2 = scanner.nextDouble();
        System.out.println("Qual a terceira nota?");
        double nota3 = scanner.nextDouble();
        System.out.println("Qual o peso da nota?");
        double peso3 = scanner.nextDouble();
        double notaPonderada = nota1*peso1 + nota2*peso2;
    }
}
