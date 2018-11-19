/*
Exercicio 01
*/

package modulo06;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        float num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.printf("Arithmetic operations\n");
        System.out.print("Enter the first number: ");
        num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = input.nextFloat();
        System.out.println("RESULTADOS:");
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1+num2);
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1*num2);
        if (num2 != 0)
            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1/num2);
        else
            System.out.println("You can't divide by zero.");
    }
    
    
}
