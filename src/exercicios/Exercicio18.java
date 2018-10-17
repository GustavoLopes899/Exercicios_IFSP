package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Entre com o valor inteiro [%d/%d]: ", i + 1, vetor.length);
            try {
                vetor[i] = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Valor inválido!");
            }
        }
        try {
            System.out.printf("Entre com um valor para ser buscado no vetor: ");
            int busca = input.nextInt();
            boolean achou = false;
            for (int i = 0; i < vetor.length; i++) {
                if (busca == vetor[i]) {
                    System.out.printf("O valor está na posição %d do vetor.\n", i);
                    achou = true;
                }
            }
            if (!achou) {
                System.out.println("Valor não encontrado!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Valor inválido!");
        }
    }

}
