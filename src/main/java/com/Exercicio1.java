package main.java.com;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.println("digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        System.out.println("A média do aluno é: " + (primeiraNota + segundaNota) / 2);
    }
}
