package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o peso da encomenda?");
        double peso = scanner.nextDouble();
        System.out.println("Qual o tipo de entrega? (SEDEX OU SEDEX10)");
        String tipo = scanner.next();
        System.out.println("Qual a região do país?");
        String regiao = scanner.next();
        int taxaPeso = 0;
        int taxaTipo = 0;
        int taxaRegiao = 0;

        if (peso <= 1) {
            taxaPeso = 5;
        } else if (peso <= 5) {
            taxaPeso = 10;
        } else if (peso > 5) {
            taxaPeso = 15;
        }
        if (tipo.equalsIgnoreCase("SEDEX")) {
            taxaTipo = 9;
        } else if (tipo.equalsIgnoreCase("SEDEX10")) {
            taxaTipo = 11;
        }
        if (regiao.equalsIgnoreCase("norte")) {
            taxaRegiao = 4;
        } else if (regiao.equalsIgnoreCase("nordeste")) {
            taxaRegiao = 2;
        } else if (regiao.equalsIgnoreCase("centro-oeste")) {
            taxaRegiao = 5;
        } else if (regiao.equalsIgnoreCase("sudeste")) {
            taxaRegiao = 2;
        } else if (regiao.equalsIgnoreCase("sul")) {
            taxaRegiao = 3;
        }
        int valor = taxaPeso + taxaTipo + taxaRegiao;
        System.out.println("o valor é R$" + valor);
    }
}
