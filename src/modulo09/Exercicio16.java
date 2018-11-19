package modulo09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[3];
        int menor, maior;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Entre com um número inteiro [%d/%d]: ", i + 1, numeros.length);
            try {
                numeros[i] = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Valor incorreto!");
            }
        }
        menor = maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.printf("Menor: %d    Maior: %d\n", menor, maior);
    }

}
