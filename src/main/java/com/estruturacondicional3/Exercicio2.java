package main.java.com.estruturacondicional3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do empréstimo");
        double emprestimo = scanner.nextDouble();
        System.out.println("qual a quantidade de parcelas");
        int parcelas = scanner.nextInt();
        System.out.println("qual seu salário?");
        double salario = scanner.nextDouble();
        double valorParcela = emprestimo / parcelas;

        if (parcelas > 24) {
            System.out.println("Número de parcela excedido");
        } else if (parcelas <= 24 && valorParcela <= (salario * 30 / 100)) {
            System.out.println("emprestimo aceito");
        } else if (parcelas <= 24 && valorParcela > (salario * 30 /100)){
            System.out.println("Valor de parcela excedido");
        }
    }
}
