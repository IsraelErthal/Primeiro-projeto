package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        int valorX = scanner.nextInt();
        System.out.println("Digite o valor de A");
        double valorA = scanner.nextDouble();
        System.out.println("Digite o valor de B");
        double valorB = scanner.nextDouble();

        switch (valorX) {
            case 1:
                System.out.println("A soma é " + (valorA + valorB));
            break;

            case 2:
                System.out.println("A divisão é " + (valorA / valorB));
            break;

            case 3:
                if (valorA > valorB)
                    System.out.println("A ordem crescente é " + (valorA) + ", " + (valorB));
                else if (valorB > valorA){
                    System.out.println("A ordem crescente é " + (valorB) + ", " + (valorA));
                } else {
                    System.out.println("Os números são iguais");
                }
            break;

            case 4:
                if (valorA > valorB)
                    System.out.println("A diferença é " + (valorA - valorB));
                else if (valorB > valorA){
                    System.out.println("A diferença é " + (valorB - valorA));
                } else {
                    System.out.println("Os números são iguais");
                }
            break;
            case 5:
                System.out.println("A média é " + ((valorA + valorB) / 2));

            default:
                System.out.println("valor de x inválido");
        }
    }
}
