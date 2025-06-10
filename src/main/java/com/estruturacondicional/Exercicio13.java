package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro Número ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número ");
        int n3 = scanner.nextInt();
        int maior=0;
        int meio = 0;
        int menor = 0;

       if (n1 > n2 && n1 > n3) {
           maior = n1;
           if (n2 > n3){
               meio = n2;
               menor = n3;
           } else {
               meio = n3;
               menor = n2;
           }
       }if (n2 > n1 && n2 > n3) {
            maior = n2;
            if (n1 > n3){
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        }if (n3 > n1 && n3 > n2) {
            maior = n3;
            if (n2 > n1){
                meio = n2;
                menor = n1;
            } else {
                meio = n1;
                menor = n2;
            }
        }
        System.out.println("A ordem crescente é " + menor + "," + meio + "," + maior);
    }
}
