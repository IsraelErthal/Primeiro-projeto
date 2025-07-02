package main.java.com.exerciciosbase;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o produto?");
        String nomeProduto = scanner.next();

        System.out.println("Por quanto ele foi comprado?");
        double valorCompra = scanner.nextDouble();

        System.out.println("Por quanto ele foi vendido?");
        double valorVenda = scanner.nextDouble();
                double lucro = valorVenda - valorCompra;

        System.out.println("O lucro da venda de " + nomeProduto + " foi: " + lucro);
    }
}
