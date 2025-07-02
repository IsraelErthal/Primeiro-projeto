package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int contador2 = 0;
        double soma = 0;

        while (contador < 5) {
            System.out.println("Qual a temperatura da cidade");
            double temperatura = scanner.nextDouble();
            contador ++;
            soma = soma + temperatura;

            if (temperatura <= 10) {
                contador2++;
            }
        }
        double media = soma / 5;
        System.out.println("A média de temperatura das cidades é " + media);
        System.out.print("A quantidade de cidades com temperaturas abaixo de 10 é " + contador2);
    }
}
