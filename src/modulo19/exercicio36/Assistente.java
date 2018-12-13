package modulo19.exercicio36;

public class Assistente extends Funcionario {
    
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("Matricula: %d\n", this.getMatricula());
    }
}
