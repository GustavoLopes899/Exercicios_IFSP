package modulo15;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(100);
        int tentativas = 0;
        boolean ganhou = false;
        while (!ganhou) {
            System.out.printf("Chute um número: ");
            try {
                int palpite = input.nextInt();
                if (numero > palpite) {
                    System.out.println("O número é maior que o palpite.");
                    tentativas++;
                } else if (numero < palpite) {
                    System.out.println("O número é menor que o palpite.");
                    tentativas++;
                } else if (numero == palpite) {
                    System.out.println("Você acertou o número.");
                    tentativas++;
                    System.out.printf("Número de tentantivas: %d\n", tentativas);
                    ganhou = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Número inválido, tente novamente...");
            }
        }
    }

}
