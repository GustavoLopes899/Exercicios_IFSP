/*
Exercicio 06
*/

package exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.printf("Digite um número inteiro: ");
            int numero = input.nextInt();
            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("O valor digitado é inválido!");
        }
    }

}
