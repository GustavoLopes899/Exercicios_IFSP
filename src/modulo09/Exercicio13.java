package modulo09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notas[] = new double[3];
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Entre com a nota %d do aluno: ", i+1);
            try {
                notas[i] = input.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Valor incorreto!");
            }
            media += notas[i];
        }
        media /= 3;
        System.out.printf("A média final do aluno é %.2f.\n", media);
        if  (media >= 6) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }

}
