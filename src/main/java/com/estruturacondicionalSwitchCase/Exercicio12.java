package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do seu m~ES PARA SABER SEU SIGNO");
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

        }
    }
}
