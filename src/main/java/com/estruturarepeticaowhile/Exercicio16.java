package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double valor = 0;
        double maiorCompra = valor;
        double soma = 0;
        while (contador < 5) {
            System.out.println("Digite o valor da compra");
            valor = scanner.nextDouble();

            if (contador == 0) {
                maiorCompra = valor;
            }
            if (valor > maiorCompra) {
                maiorCompra = valor;
            }

            soma += valor;
            contador++;
        }
         double media = soma / 5;

        System.out.println("A compra de maior valor custou " + maiorCompra);
        System.out.print("E a média dos valores foi " + media);
    }
}
