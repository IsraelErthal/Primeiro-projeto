package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros = 0;
        int contador = 0;
        int somaNumeros = 0;
        while (true) {
            System.out.println("Digite números positivos");
            numeros = scanner.nextInt();
            if (numeros < 0){
                break;
            }
            somaNumeros = somaNumeros + numeros;
            contador = contador + 1;
        }
        double media = somaNumeros / contador;
        System.out.println("A média dos números positivos até agora é " + media);
    }
}
