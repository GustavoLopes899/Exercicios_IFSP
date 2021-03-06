package projetofinal;

public class Operacao {
    
    private String tipo;
    private float valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Operacao {tipo=%s, valor=%.2f}", tipo, valor);
    }
    
}
