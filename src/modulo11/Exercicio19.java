package modulo11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[15];
        int num1, num2;
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Entre com o valor inteiro [%d/%d]: ", i + 1, vetor.length);
            try {
                vetor[i] = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Valor inválido!");
            }
        }

        try {
            do {
                System.out.printf("Primeira posição da soma (varia de 0 até %d): ", vetor.length - 1);
                num1 = input.nextInt();
            } while (num1 < 0 || num1 > vetor.length - 1);
            do {
                System.out.printf("Segunda posição da soma (varia de 0 até %d): ", vetor.length - 1);
                num2 = input.nextInt();
            } while (num2 < 0 || num2 > vetor.length - 1);
            int soma = vetor[num1] + vetor[num2];
            System.out.printf("A soma dos números %d (vetor[%d]) e %d (vetor[%d]) é: %d.\n", vetor[num1], num1, vetor[num2], num2, soma);
        } catch (InputMismatchException ex) {
            System.out.println("Valor inválido!");
        }
    }

}
