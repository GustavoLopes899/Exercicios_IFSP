/*
Exercicio 05
*/

package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double delta;
        double x[] = new double[2];
        System.out.printf("Solution of a second degree equation\n");
        System.out.printf("Format: Ax² + Bx + C = 0\n");
        System.out.print("Value of A: ");
        a = input.nextInt();
        System.out.print("Value of B: ");
        b = input.nextInt();
        System.out.print("Value of C: ");
        c = input.nextInt();
        if (a == 0) {
            System.out.println("This is not a second degree equation...");
            return;
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("There no is real root for this equation.");
            } else {
                x[0] = (-b + Math.sqrt(delta)) / (2 * a);
                x[1] = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x' = %.2f\n", x[0]);
                if (delta != 0) {
                    System.out.printf("x'' = %.2f\n", x[1]);
                }
            }
        }

    }
}
