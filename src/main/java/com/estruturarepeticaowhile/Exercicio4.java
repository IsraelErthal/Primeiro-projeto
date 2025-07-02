package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int sair = 0;
        while (sair != 3) {
            System.out.println("Digite a idade do colaborador");
            int idade = scanner.nextInt();
            if ((idade >= 18 && idade <= 25)) {
                contador1 = contador1 + 1;
            } else if (idade >= 26 && idade <= 50) {
                contador2 = contador2 + 1;
            } else if (idade >= 51 && idade <= 65) {
                contador3 = contador3 + 1;
            }
            System.out.println("Digite 3 para sair");
            sair = scanner.nextInt();
        }
        System.out.println("a quantidade de 18 a 25 é " + contador1 +  ", A quantidade de 26 a 50 é " + contador2 + " E a quantidade de 51 a 65 é " + contador3);
    }
}
