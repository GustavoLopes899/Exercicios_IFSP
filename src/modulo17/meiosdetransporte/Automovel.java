package modulo17.meiosdetransporte;

public abstract class Automovel extends Veiculo {
    
    private double potenciaDoMotor;
    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Potência do motor: %.2f\n", this.getPotenciaDoMotor());
        
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

}
