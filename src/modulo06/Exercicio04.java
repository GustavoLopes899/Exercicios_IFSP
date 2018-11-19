/*
Exercicio 04
*/

package modulo06;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main (String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.printf("Circle's area\n");
        System.out.print("Enter the circle's radius: ");
        radius = input.nextFloat();
        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The circle's area is: %.2f\n", area);
    }
    
}