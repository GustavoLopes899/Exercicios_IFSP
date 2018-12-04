package modulo15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Entre com o número de linhas: ");
        try {
            int linhas = input.nextInt();
            int matrix[][] = new int[linhas][linhas];
            for (int i = 0; i <= linhas; i++) {
                for (int j = 0; j < i; j++) {
                    if (i < 10) {
                        System.out.printf("0%d ", i);
                    } else {
                        System.out.printf("%d ", i);
                    }
                }
                System.out.println();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Número inválido, tente novamente...");
        }
    }

}
