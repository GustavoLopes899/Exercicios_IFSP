package projetofinal;

import java.util.Scanner;

public class Conta {

    private static int numero = 1;
    private String nome;
    private String senha;
    private float saldo = 0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "nome=" + nome + ", senha=" + senha + ", saldo=" + saldo + '}';
    }

    public void criarConta() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Criação de conta:");
        System.out.printf("Entre com o nome do conrrentista: ");
        String nome = input.nextLine();
        System.out.printf("Entre com senha: ");
        String senha = input.nextLine();
        this.setNumero(numero++);
        this.setNome(nome);
        this.setSenha(senha);
        System.out.println("Conta cadastrada com sucesso!");
        System.out.println();
    }

    public boolean debito(float valor) {
        if (valor > 0) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                return true;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Valor inválido!");
        }
        return false;
    }

    public boolean credito(float valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            return true;
        } else {
            System.out.println("Valor inválido!");
        }
        return false;
    }

}
