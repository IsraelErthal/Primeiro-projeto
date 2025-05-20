package main.java.com;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        Integer primeiroNumero = 10;
        Integer segundoNumero = 25;

        BigDecimal resultado = new BigDecimal(primeiroNumero)
                .divide(new BigDecimal(segundoNumero));

      double soma = (double) primeiroNumero / (double) segundoNumero;

        System.out.println("Primeiro Número " + primeiroNumero);
        System.out.println("Segundo Número " + segundoNumero);
        System.out.println(primeiroNumero + segundoNumero );
        System.out.println(soma);

    }
}
