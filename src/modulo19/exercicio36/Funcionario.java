package modulo19.exercicio36;

public class Funcionario {
    
    private int id;
    private String nome;
    private double salario;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void exibeDados() {
        System.out.println("Dados do funcionário:");
        System.out.printf("ID: %d\n", this.getId());
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("Telefone: %s\n", this.getTelefone());
        System.out.printf("Salário: %.2f\n", this.getSalario());
    }

}
