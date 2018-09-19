/*
Exercicio 08
*/

package exercicios;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.printf("Qual foi a distância percorrida pelo carro (em kms): ");
            double distancia = input.nextDouble();
            System.out.printf("Qual foi o consumo do carro (em litros): ");
            double consumo = input.nextDouble();
            double media = distancia / consumo;
            System.out.printf("O consumo médio do carro foi %.2f kms/l.\n", media);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Valor inserido é incorreto!");
        }
    }

}
