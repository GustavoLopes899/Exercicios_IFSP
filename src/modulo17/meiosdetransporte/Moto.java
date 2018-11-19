package modulo17.meiosdetransporte;

public class Moto extends Automovel {
    
    private boolean partidaEletrica;
    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.printf("Partida elétrica: %b\n", this.isPartidaEletrica());
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

}
