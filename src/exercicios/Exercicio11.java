package exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean acabou = false;
        System.out.println("Conversão de dólar(US$) para real(R$)");
        try {
            System.out.printf("Entre com a cotação do dólar(es): ");
            float cotacao = input.nextFloat();
            System.out.printf("Entre com o valor em dólar(es): ");
            float dolar = input.nextFloat();
            float conversao = cotacao * dolar;
            System.out.printf("O valor de US$%.2f é de R$%.2f.\n", dolar, conversao);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Valor invaĺido.");
        }
    }

}
