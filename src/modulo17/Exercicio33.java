package modulo17;

public class Exercicio33 {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);
        agenda.adicionarContato();
        agenda.adicionarContato();
        agenda.excluirContato("123");
        agenda.listarContatos();
        Contato contato = agenda.buscarContato("123");
        if (contato != null) {
            System.out.println("Busca com nome: " + contato);
        }
        agenda.adicionarContato();
        agenda.listarContatos();
    }

}
