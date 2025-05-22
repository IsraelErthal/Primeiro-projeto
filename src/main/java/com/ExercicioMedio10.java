package main.java.com;

import java.util.Scanner;

public class ExercicioMedio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para descobrir a possibilidade digite o valor de favoráveis");
        int favoraveis = scanner.nextInt();
        System.out.println("Agora o valor de casos possíveis");
        int casosPossiveis = scanner.nextInt();
        int probabilidade = (favoraveis*casosPossiveis)/100;
        System.out.println("A probabilidade é de " + probabilidade + "%");
    }
}
