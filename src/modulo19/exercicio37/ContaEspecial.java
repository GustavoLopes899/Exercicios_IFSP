package modulo19.exercicio37;

public class ContaEspecial extends ContaCorrente {
    
    @Override
    public void sacar(float valor) {
        if (valor > 0) {
            if (this.getSaldo() >= valor + valor * 0.01f) {
                this.setSaldo(this.getSaldo() - valor);
                this.setSaldo(this.getSaldo() - valor * 0.01f);
            } else {
                System.err.println("Saldo insuficiente!");
            }
        } else {
            System.err.println("Valor inválido!");
        }
    }

}
