package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            System.out.printf("Entre com um número inteiro: ");
            n = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Número inválido!");
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }

}
