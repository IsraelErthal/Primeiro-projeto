package main.java.com.exerciciosbase;

import java.util.Scanner;

public class ExercicioMedio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para descobrir a soma e a diferença das distâncias de dois planetas até a terra, digite a distância do primeiro planeta ");
        double dPlaneta1 = scanner.nextDouble();
        System.out.println("Agora a distância do segundo planeta");
        double dPlaneta2 = scanner.nextDouble();
        double somaD = dPlaneta1 + dPlaneta2;
        double diferencaD = dPlaneta1 - dPlaneta2;
        System.out.println("A soma é de " + somaD + " e a diferença é de "+diferencaD);
    }
}
