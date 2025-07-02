package main.java.com.exerciciosbase;

import java.util.Scanner;

public class ExercicioMedio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para saber a temperatura em Fahrenheit, digite a temperatura em celsius");
        double grausCelsius = scanner.nextDouble();
        double grausFahrenheit = grausCelsius * 9 / 5 +32;
        System.out.println("a temperatura em Fahrenheit é " + grausFahrenheit + "°");

    }
}
