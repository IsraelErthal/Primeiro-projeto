package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite sua primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media < 7.5){
            System.out.println(nome + ", Sua média é " + media + ", Você foi reprovado!");
        }else {
            System.out.println(nome + ", Sua média é " + media + ", Você foi aprovado!");
        }
    }
}
