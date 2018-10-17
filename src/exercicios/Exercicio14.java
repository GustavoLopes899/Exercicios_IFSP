package exercicios;

public class Exercicio14 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Tabuada do %d\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println("");
        }
    }

}
