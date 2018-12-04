package modulo15;

import java.util.Random;

public class Exercicio29 {
    
    public static void main(String[] args) {
        Random random = new Random();
        System.out.printf("Números sorteados = [");
        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(100);
            System.out.print(number);
            System.out.printf(" ");
        }
        System.out.println("]");
    }

}
