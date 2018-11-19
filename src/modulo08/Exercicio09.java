/*
Exercicio 09
*/

package modulo08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioFinal = 0;
        try {
            System.out.printf("Entre com o nome do funcionário: ");
            String nome = input.nextLine();
            System.out.printf("Entre com o valor do salário fixo do funcionário (em R$): ");
            double salarioFixo = input.nextDouble();
            System.out.printf("Entre com a quantidades de vendas do funcionário (em R$): ");
            double vendas = input.nextDouble();
            salarioFinal = salarioFixo + vendas * 0.15;
            System.out.printf("Nome: %s\n", nome);
            System.out.printf("Salário fixo: R$%.2f\n", salarioFixo);
            System.out.printf("Vendas: R$%.2f\n", vendas);
            System.out.printf("Salário final: R$%.2f\n", salarioFinal);
            
        } catch (InputMismatchException ex) {
            System.out.println("Valor inválido!");
        }
    }

}
