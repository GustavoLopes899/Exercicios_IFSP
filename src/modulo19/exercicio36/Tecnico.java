package modulo19.exercicio36;

public class Tecnico extends Assistente {
    
    private float bonusSalario;

    public float getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(float bonusSalario) {
        this.bonusSalario = bonusSalario;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("Bônus Salarial: R$%.2f\n", this.getBonusSalario());
    }

}
