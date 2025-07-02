package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int contador2 = 0;
        double soma = 0;

        while (contador < 10) {
            System.out.println("qual o valor da compra?");
            double valor = scanner.nextDouble();
            soma = soma + valor;
            contador++;

            if (valor > 100) {
                contador2 ++;
            }
        }
        double media = soma / 10;
        System.out.println("a média das compras é " + media + " e a quantidade de clientes cujas compras excederam 100 reais é " + contador2);
    }
}
