package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 0;
        try {
            System.out.printf("Entre com uma idade: ");
            idade = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Idade inválida");
        }
        if (idade <= 12) {
            System.out.println("A pessoa é uma criança.");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("A pessoa é um adolescente.");
        } else if (idade > 17 && idade <= 60) {
                System.out.println("A pessoa é um adulto.");
        } else {
            System.out.println("A pessoa é um idoso.");
        }

    }

}
