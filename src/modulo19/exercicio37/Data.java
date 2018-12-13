package modulo19.exercicio37;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        }
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        }
        if (ano > 0) {
            this.ano = ano;
        }
    }
    
    public Data() {
        Calendar cal = Calendar.getInstance();
        this.dia = cal.get(Calendar.DAY_OF_MONTH);
        this.mes = cal.get(Calendar.MONTH);
        this.ano = cal.get(Calendar.YEAR);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void exibirData() {
        System.out.printf("%2d/%2d/%d\n", this.getDia(), this.getMes(), this.getAno());
    }
    
    public void avancarData() {
        if (this.getDia() == 31) {
            this.setDia(1);
            if (this.getMes() == 12) {
                this.setMes(1);
                this.setAno(this.getAno() + 1);
            }
        } else {
            this.setDia(this.getDia() + 1);
        }
    }

}
