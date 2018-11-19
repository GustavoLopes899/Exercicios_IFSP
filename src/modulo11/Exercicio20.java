package modulo11;

public class Exercicio20 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        int impar = 0;
        for (int i = 0; i < vetor.length; i++) {
            do {
                impar++;
            } while (impar % 2 == 0);
            vetor[i] = impar;
            System.out.println(impar);
        }
    }

}
