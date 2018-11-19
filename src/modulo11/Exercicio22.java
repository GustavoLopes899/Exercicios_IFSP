package modulo11;

public class Exercicio22 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[11][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

}
