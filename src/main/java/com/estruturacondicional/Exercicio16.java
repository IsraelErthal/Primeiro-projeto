package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A quanto tempo você está na empresa? (Em anos)");
        int anos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual a sua função?");
        String funcao = scanner.nextLine();
        System.out.println("Escreva sua escolaridade");
        String escolaridade = scanner.nextLine();
        int porcentoAnos = 0;
        int porcentoFuncao = 0;
        int porcentoEscolaridade= 0;

        if (anos <= 5) {
            porcentoAnos = 2;
        } else if (anos <= 10) {
            porcentoAnos = 4;
        } else if (anos > 10) {
            porcentoAnos = 6;
        }
        if (funcao.equalsIgnoreCase("suporte")) {
            porcentoFuncao = 3;
        } else if (funcao.equalsIgnoreCase("programador")) {
            porcentoFuncao = 4;
        } else if (funcao.equalsIgnoreCase("analista")) {
            porcentoFuncao = 5;
        }
        if (escolaridade.equalsIgnoreCase("sem curso superior")) {
            porcentoEscolaridade = 0;
        } else if (escolaridade.equalsIgnoreCase("com curso superior")) {
            porcentoEscolaridade = 7;
        } else if (escolaridade.equalsIgnoreCase("com pós-graduação")) {
            porcentoEscolaridade = 9;
        }
        int porcento = porcentoAnos + porcentoFuncao + porcentoEscolaridade;
        System.out.println("a porcetagem de aumento foi " + porcento);
    }
}
