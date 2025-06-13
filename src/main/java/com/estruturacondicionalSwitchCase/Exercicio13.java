package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a temperatura");
        double temperatura = scanner.nextDouble();
        System.out.println("Qual o tipo de conversão (numero de 1 a 4)");
        int conversao = scanner.nextInt();

        switch (conversao) {
            case 1:
                System.out.println("A temperatura em Fahrenheit é" + (temperatura * 9 / 5 + 32 ) + "°");
            break;

            case 2:
                System.out.println("A temperatura em kevin é " + (temperatura + 273) + "°");
            break;

            case 3:
                System.out.println("A temperatura em celsius é " + ((temperatura - 32) * 5 / 9) + "°" );
            break;

            case 4:
                System.out.println("A temperatura em celsius é " + (temperatura - 273) + "°");
        }

    }
}
