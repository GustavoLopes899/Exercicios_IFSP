/*
Exercicio 02
*/

package modulo06;

public class Exercicio02 {
    
    public static void main (String[] args) {
        int a = 5, b= 9, aux;
        System.out.println("BEFORE: The value of A is " + a + " and the value of B is " + b + ".");
        aux = a;
        a = b;
        b = aux;
        System.out.println("AFTER: The value of A is " + a + " and the value of B is " + b + ".");
    }
    
}
