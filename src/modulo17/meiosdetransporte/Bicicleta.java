package modulo17.meiosdetransporte;

public class Bicicleta extends Veiculo {
    
    private int numMarchas;
    private boolean bagageiro;
    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Número de marchas: %d\n", this.getNumMarchas());
        System.out.printf("Bagageiro: %b\n", this.isBagageiro());
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

}
