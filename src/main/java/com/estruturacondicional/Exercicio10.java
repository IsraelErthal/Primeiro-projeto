package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        if (idade < 16) {
            System.out.println("Não poderá votar");
        } else if (idade<=17) {
            System.out.println("Voto opcional");
        } else if (idade > 60) {
            System.out.println("Voto opcional");
        } else if (idade >= 18) {
            System.out.println("Voto obrigatório");
        }
    }
}
