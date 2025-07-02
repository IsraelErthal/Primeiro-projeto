package main.java.com.exerciciosbase;

import java.util.Scanner;

public class ExercicioMedio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para descobrir sua velocidade média, digite quantos KM percorreu");
        double quilometros = scanner.nextDouble();
        System.out.println("Agora digite o tempo, em horas, que sua viagem durou");
        double tempo = scanner.nextDouble();
        double velocidadeMedia = quilometros / tempo;
        System.out.println("Sua velocidade média foi: " + velocidadeMedia + "Km/h");
    }
}
