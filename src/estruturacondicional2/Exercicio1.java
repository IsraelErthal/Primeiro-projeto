package estruturacondicional2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário");
        double salario = scanner.nextDouble();

        double salarioAnual = salario * 12;
        double porcetagem = 0;
        double valorImposto = 0;

        if (salarioAnual <= 22847.76) {
            System.out.println("Isento de imposto");
        } else if ( salarioAnual <= 33919.80) {
            porcetagem = 7.5;
            valorImposto = (salarioAnual * porcetagem) / 100;
            System.out.println("O valor a ser pago é R$" + valorImposto);
        } else if ( salarioAnual <= 45012.60 ) {
            porcetagem = 15;
            valorImposto = (salarioAnual * porcetagem) / 100;
            System.out.println("O valor a ser pago é R$" + valorImposto);
        } else if ( salarioAnual <= 55976.16 ) {
            porcetagem = 22.5;
            valorImposto = (salarioAnual * porcetagem) / 100;
            System.out.println("O valor a ser pago é R$" + valorImposto);
        } else if ( salarioAnual > 55976.16 ) {
            porcetagem = 27.5;
            valorImposto = (salarioAnual * porcetagem) / 100;
            System.out.println("O valor a ser pago é R$" + valorImposto);
        }
    }
}
