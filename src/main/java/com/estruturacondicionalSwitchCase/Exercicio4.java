package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do livro");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Livro de ficção");
            break;

            case 2:
                System.out.println("Livor de Não ficção");
            break;

            case 3:
                System.out.println("Livro de romance");
            break;

            case 4:
                System.out.println("Livro de terror");
            break;

            case 5:
                System.out.println("Livro de mistério");
            break;

            default:
                System.out.println("Categoria não registrada");
        }
    }
}
