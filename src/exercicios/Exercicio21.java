package exercicios;

import java.util.Random;

public class Exercicio21 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[100];
        int soma = 0;
        System.out.println("Valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10);
            System.out.printf("%d ", vetor[i]);
        }
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("");
        System.out.printf("Soma: %d\n", soma);
    }

}
