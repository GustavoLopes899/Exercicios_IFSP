package modulo17;

public class Lampada {
    
    private boolean ligada = false;
    
    public void ligar() {
        if (!ligada) {
            System.out.println("A lâmpada ligou.");
            ligada = true;
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }
    
    public void desligar() {
        if (ligada) {
            System.out.println("A lâmpada desligou.");
            ligada = false;
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }
    
    public void status() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

}
