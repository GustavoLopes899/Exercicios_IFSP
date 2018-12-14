package projetofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {

    private static int qntidadeContas = 0;
    private int numero;
    private String nome;
    private String senha;
    private float saldo = 0;
    private ArrayList<Operacao> operacoes = new ArrayList<>();

    public Conta() {
        Conta.qntidadeContas++;
    }

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
        return String.format("Conta {numero=%d, nome=%s, senha=%s, saldo=%.2f}", numero, nome, senha, saldo);
    }

    public void criarConta() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Criação de conta:");
        System.out.println("Número da conta: " + Conta.qntidadeContas);
        System.out.printf("Entre com o nome do conrrentista: ");
        String nome = input.nextLine();
        System.out.printf("Entre com senha: ");
        String senha = input.nextLine();
        this.setNumero(Conta.qntidadeContas);
        this.setNome(nome);
        this.setSenha(senha);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public boolean debito(float valor) {
        System.out.println();
        if (valor > 0) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                Operacao op = new Operacao();
                op.setTipo("Débito");
                op.setValor(valor);
                operacoes.add(op);
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
            Operacao op = new Operacao();
            op.setTipo("Crédito");
            op.setValor(valor);
            operacoes.add(op);
            return true;
        } else {
            System.out.println("Valor inválido!");
        }
        return false;
    }

    public void listarOperacoes() {
        if (operacoes.isEmpty()) {
            System.out.println("A conta ainda não possui nenhuma operação realizada.");
        }
        for (int i = 0; i < operacoes.size(); i++) {
            Operacao op = operacoes.get(i);
            System.out.printf("%d - ", i + 1);
            System.out.println(op);
        }
    }

}
