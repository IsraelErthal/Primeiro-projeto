package main.java.com;

import java.util.Scanner;

public class ExercicioMedio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para saber o valor final após o desconto, digite o preço do produto");
        double preçoInicial = scanner.nextDouble();
        System.out.println("Agora o percentual de desconto aplicado");
        int desconto = scanner.nextInt();
        double preçoFinal = preçoInicial - (preçoInicial * desconto / 100 );
        System.out.println("O preço final do produto é R$" + preçoFinal );
    }
}
