package modulo19.exercicio36;

public class Administrativo extends Assistente {
    
    private float adicionalNoturno;

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.printf("Adicional noturno: R$%.2f\n", this.getAdicionalNoturno());
    }

}
