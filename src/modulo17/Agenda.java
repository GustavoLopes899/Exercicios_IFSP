package modulo17;

import java.util.Scanner;

public class Agenda {
    
    private Contato[] contatos;
    
    public Agenda(int tamanho) {
        this.contatos = new Contato[tamanho];
    }
    
    public void adicionarContato() {
        Contato contato = new Contato();
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com os dados do contato:");
        System.out.printf("Nome: ");
        contato.setNome(input.nextLine());
        System.out.printf("Email: ");
        contato.setEmail(input.nextLine());
        for (int i = 0; i < this.contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                System.out.println("Contato adicionado com sucesso!");
                return;
            }
        }
        System.err.println("A agenda está cheia, não foi possível adicionar o contato.");
    }
    
    public void excluirContato(String nome) {
        for (int i = 0; i < this.contatos.length; i++) {
            if (this.contatos[i] != null && this.contatos[i].getNome().equals(nome)) {
                this.contatos[i] = null;
                System.out.printf("O contato %s foi excluido da agenda.\n", nome);
                return;
            }
        }
    }
    
    public Contato buscarContato(String nome) {
        for (Contato contato : this.contatos) {
            if (contato != null && contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }
    
    public void listarContatos() {
        for (int i = 0; i < this.contatos.length; i++) {
            Contato contato = this.contatos[i];
            if (contato != null) {
                System.out.printf("Agenda[%d] - ", i);
                System.out.println(contato);
            }
        }
    }

}
