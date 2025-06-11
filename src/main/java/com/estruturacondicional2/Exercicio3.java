package main.java.com.estruturacondicional2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a sgunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        
        if ((nota1 < 0) || (nota2 < 0) || (nota3 < 0)) {
            System.out.println("nota inválida");
        } else if ((nota1 > 10) || (nota2 > 10) || (nota3 > 10)) {
            System.out.println("nota inválida");
        } else if (media < 4) {
            System.out.println("reprovado");
        } else if (media < 6) {
            System.out.println("Em recuperação");
        } else if (media > 6) {
            System.out.println("Aprovado");

        }
    }
}
