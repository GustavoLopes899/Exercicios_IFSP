package modulo17.meiosdetransporte;

public abstract class Veiculo {

    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade = 0;

    public void imprimirInformacoes() {
        System.out.printf("Marca: %s\n", this.getMarca());
        System.out.printf("Quantidade de rodas: %s\n", this.getQtdRodas());
        System.out.printf("Modelo: %s\n", this.getModelo());
        System.out.printf("Velocidade: %d km/h\n", this.getVelocidade());
    }

    public void acelerar(int valor) {
        this.setVelocidade(velocidade + valor);
    }

    public void frear(int valor) {
        if (valor > this.getVelocidade()) {
            this.setVelocidade(0);
        } else {
            this.setVelocidade(velocidade - valor);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
