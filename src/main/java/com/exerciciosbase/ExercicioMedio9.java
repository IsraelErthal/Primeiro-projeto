package main.java.com.exerciciosbase;

import java.util.Scanner;

public class ExercicioMedio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para descobrir o tempo de viagem, digite a distância em KM");
        double distancia = scanner.nextDouble();
        System.out.println("Agora, digite a velocidade média em KM/H");
        double velocidadeMedia = scanner.nextDouble();
        double tempoViagem = distancia / velocidadeMedia;
        System.out.println("O tempo de viagem é de "+tempoViagem);
    }
}
