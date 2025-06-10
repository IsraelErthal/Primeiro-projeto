package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua refeição?");
        String refeicao = scanner.nextLine();
        System.out.println("qual sua sobremesa?");
        String sobremesa = scanner.nextLine();
        System.out.println("Qual sua bebida?");
        String bebida = scanner.nextLine();
        int caloriasRef = 0;
        int caloriasSobremesa = 0;
        int caloriasBeb = 0;
        
        if (refeicao.equalsIgnoreCase("vegetariano")) {
            caloriasRef = 180;
        } else if (refeicao.equalsIgnoreCase("peixe")) {
            caloriasRef = 230;
        } else if (refeicao.equalsIgnoreCase("frango")) {
            caloriasRef = 250;
        } else if (refeicao.equalsIgnoreCase("carne")) {
            caloriasRef = 350;
        }
        if (sobremesa.equalsIgnoreCase("abacaxi")) {
            caloriasSobremesa = 70;
        } else if (sobremesa.equalsIgnoreCase("sorvete")) {
            caloriasSobremesa = 110;
        } else if (sobremesa.equalsIgnoreCase("mousse")) {
            caloriasSobremesa = 200;
        }
        if (bebida.equalsIgnoreCase("suco")) {
            caloriasBeb = 80;
        } else if (bebida.equalsIgnoreCase("refrigerante")) {
            caloriasBeb = 200;
        }
        int caloriasIngeridas = caloriasRef + caloriasBeb + caloriasSobremesa;
        System.out.println("A quantidade de calorias ingeridas foi " + caloriasIngeridas);
    }
}
