/*
Exercicio 03 
*/

package modulo06;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main (String[] args) {
        double num, square;
        Scanner input = new Scanner(System.in);
        System.out.printf("Square's number\n");
        System.out.print("Enter a floating point number: ");
        num = input.nextFloat();
        square = Math.pow(num, 2);
        System.out.printf("The number %.2f's square is: %.2f\n", num, square);
    }
    
    
}
