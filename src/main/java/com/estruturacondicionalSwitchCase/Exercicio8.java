package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota");
        int nota = scanner.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("insuficiente");
            break;

            case 4:
            case 5:
                System.out.println("regular");
            break;

            case 6:
            case 7:
                System.out.println("bom");
            break;

            case 8:
            case 9:
                System.out.println("muito bom");
            break;

            case 10:
                System.out.println("excelente");
            break;

            default:
                System.out.println("impossivel chefe");
        }
    }
}
