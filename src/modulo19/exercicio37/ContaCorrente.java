package modulo19.exercicio37;

public class ContaCorrente {

    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.err.println("Saldo inválido!");
        }
    }

    public void sacar(float valor) {
        if (valor > 0) {
            if (this.saldo >= valor + valor * 0.05f) {
                this.saldo -= valor;
                this.saldo -= valor * 0.05f;
            } else {
                System.err.println("Saldo insuficiente!");
            }
        } else {
            System.err.println("Valor inválido!");
        }
    }

    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.err.println("Valor inválido!");
        }
    }

    public void obterSaldo() {
        System.out.printf("O saldo da conta é: R$%.2f\n", this.getSaldo());
    }

}
