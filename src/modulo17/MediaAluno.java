package modulo17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaAluno {

    private int[] notas;

    public MediaAluno(int tamanho) {
        this.notas = new int[tamanho];
    }

    public void adicionarNotas() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com as notas do aluno:");
        for (int i = 0; i < this.notas.length; i++) {
            try {
                do {
                    System.out.printf("Nota[%d]: ", i+1);
                    this.notas[i] = input.nextInt();
                    if (this.notas[i] < 0 || this.notas[i] > 100) {
                        System.err.println("Número fora do limite, tente novamente...");
                    }
                } while (this.notas[i] < 0 || this.notas[i] > 100);
            } catch (InputMismatchException ex) {
                System.err.println("Número inserido é inválido, tente novamente...");
                input.nextLine();
                i--;
            }
        }
    }
    
    public void calcularMedia() {
        int soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        float mediaFinal = soma/this.notas.length;
        System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);
    }

}
