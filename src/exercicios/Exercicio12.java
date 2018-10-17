package exercicios;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercicio12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Entre com um número inteiro: ");
        try {
            int numero = input.nextInt();
            if (numero >= 0 && numero <= 100) {
                System.out.println("Você digitou um número entre 0 e 100");
            } else {
                System.out.println("Você digitou um número fora da feixa entre 0 e 100");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Valor inválido.");
        }
    }

}
