package main.java.com.estruturacondicionalSwitchCase;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um prato de 1 a 5");
        int prato = scanner.nextInt();

        switch (prato) {
            case 1:
                System.out.println("O prato é feijoada, custa R$110,00 e leva 30 minutos");
                break;

            case 2:
                System.out.println("O prato é galinhada, custa R$70,00 e leva 20 minutos");
                break;

            case 3:
                System.out.println("o prato é risoto custa R$120,00 e leva 40 minutos");
            break;

            case 4:
                System.out.println("O prato é X-tudo, custa R$40,00 e leva 30 minutos");
            break;

            case 5:
                System.out.println("O prato é churrasco, custa R$130,00 e leva 30 minutos");
                break;

            default:
                System.out.println("não existe");
        }
    }
}
