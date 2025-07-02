package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int numero = 0;
        int menorNumero = numero;
        int maiorNumero = numero;

        while (contador < 10) {
            System.out.println("Digite um número");
            numero = scanner.nextInt();

            if (contador == 0) {
                maiorNumero = numero;
                menorNumero = numero;
            }

            if (numero < menorNumero) {
                menorNumero = numero;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            contador++;
        }
        System.out.println("O maior número é " + maiorNumero);
        System.out.print("O menor número é " + menorNumero);
    }
}
