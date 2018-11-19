/*
Exercicio 07
*/

package modulo08;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int divisor = 0;
        try {
            System.out.printf("Digite um número inteiro: ");
            int numero = input.nextInt();
            System.out.printf("O número %d ", numero);
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    divisor++;
                    if (divisor > 2) {
                        System.out.println("não é um numero primo.");
                        return;
                    }
                }
            }
            System.out.println("é um número primo.");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("O valor digitado é inválido!");
        }
    }

}
