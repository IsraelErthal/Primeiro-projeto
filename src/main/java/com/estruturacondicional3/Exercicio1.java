package main.java.com.estruturacondicional3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCerto = "admin";
        int senhaCerta = 1234;

        System.out.println("Digite o usuario");
        String usuario = scanner.next();
        System.out.println("Digite a senha");
        int senha = scanner.nextInt();

        if (usuario.equalsIgnoreCase(usuarioCerto) && senha == senhaCerta) {
            System.out.println("Login permitido");
        } else {
            System.out.println("Usuario ou senha errados");

            System.out.println("digite o usuario");
            String usuario2 = scanner.next();
            System.out.println("Digite a senha");
            int senha2 = scanner.nextInt();

            if (usuario2.equalsIgnoreCase(usuarioCerto) && senha2 == senhaCerta) {
                System.out.println("Login permitido");
            } else {
                System.out.println("Usuario ou senha errados");

                System.out.println("digite o usuario");
                String usuario3 = scanner.next();
                System.out.println("Digite a senha");
                int senha3 = scanner.nextInt();

                if (usuario3.equalsIgnoreCase(usuarioCerto) && senha3 == senhaCerta) {
                    System.out.println("Login permitido");
                } else {
                    System.out.println("Conta bloqueada");
                }
            }
        }
    }
}
