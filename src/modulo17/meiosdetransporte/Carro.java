package modulo17.meiosdetransporte;

public class Carro extends Automovel {
    
    private int qtdPortas;
    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Quantidade de portas: %d\n", this.getQtdPortas());
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

}
