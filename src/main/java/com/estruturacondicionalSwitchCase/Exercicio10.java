package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para qual região é a entrega?");
        String regiao = scanner.next();

        switch (regiao) {
            case "norte":
                System.out.println("R$14,00 e 2 semanas");
            break;

            case "Nordeste":
                System.out.println("R$15,00 e 1 semana");
            break;

            case "Centro-oeste":
                System.out.println("10,00 e 3 dias");
            break;

            case "Sudeste":
                System.out.println("R$5,00 e 2 dias");
            break;

            case "Sul":
                System.out.println("R$10 e 1 semana");
                break;
            default:
                System.out.println("Região Inválida");
        }
    }
}
