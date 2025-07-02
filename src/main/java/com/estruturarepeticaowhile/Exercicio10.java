package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        int contador = 0;
        int numPar = 0;

        while(contador < 5) {
            if (numero % 2 == 0)
                numPar = numero;
        }

            System.out.println(numPar);
            contador++;
        }

    }

}
