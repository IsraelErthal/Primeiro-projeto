package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do seu mês para saber o seu signo");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("capricornio ou aquario");
            break;

            case 2:
                System.out.println("aquario ou peixes");
            break;

            case 3:
                System.out.println("peixes ou aries");
            break;

            case 4:
                System.out.println("aries ou touro");
            break;

            case 5:
                System.out.println("touro ou gemeos");
            break;

            case 6:
                System.out.println("gemeos ou cancer");
            break;

            case 7:
                System.out.println("cancer ou leao");
            break;

            case 8:
                System.out.println("Leão ou virgem");
            break;

            case 9:
                System.out.println("Virgem ou Libra");
            break;

            case 10:
                System.out.println("Libra ou escorpião");
            break;

            case 11:
                System.out.println("Escorpião ou Sagitário");
            break;

            case 12:
                System.out.println("Sagitário ou capricórnio");
            break;

            default:
                System.out.println("Mês inexistente");
        }
    }
}
