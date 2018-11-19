package modulo17.meiosdetransporte;

public class Teste34 {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Palio");
        carro.setPotenciaDoMotor(100.60);
        carro.setQtdPortas(4);
        carro.setQtdRodas(4);
        carro.setVelocidade(0);
        carro.acelerar(50);
        carro.imprimirInformacoes();
        
        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("Biz");
        moto.setPotenciaDoMotor(22);
        moto.setQtdRodas(2);
        moto.setVelocidade(0);
        moto.imprimirInformacoes();
    }

}
