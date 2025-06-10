package estruturacondicional2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite sua nacionalidade");
        String nacionalidade = scanner.next();

        if (!nacionalidade.equalsIgnoreCase("brasileiro")) {
            System.out.println("Não pode votar");
        } else if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade <= 17 || idade > 70) {
            System.out.println("Voto facultativo");
        } else if (idade >= 18) {
            System.out.println("Voto é obrigatório");
        }
    }
}
