package estruturacondicional3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano");
        int ano = scanner.nextInt();

        if (ano % 400 == 0 ) {
            System.out.println("é um ano bissexto");
        } else if (ano % 100 == 0) {
            System.out.println("Não bissexto");
        } else if (ano % 4 == 0) {
            System.out.println("Bissexto");
        } else {
            System.out.println("não bissexto");
        }

    }
}
