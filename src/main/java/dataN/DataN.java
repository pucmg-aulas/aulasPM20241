/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataN;

/**
 *
 * @author danil
 */
public class DataN {

    private int dia;
    private int mes;
    private int ano;

    public DataN(int dia, int mes, int ano) {

        this.ajustarData(dia, mes, ano);

    }
    
    public DataN(){
        
    }

    public void ajustarData(int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (!this.dataValida()) {
            this.dia = 1;
            this.ano = 1;
            this.mes = 1;
        }
    }

    public boolean dataValida() {
        int[] mesesDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (this.dia < 1 || this.mes < 1 || this.ano < 1 || this.dia > 31) {
            return false;
        }
        if (this.anoBissexto()) {
            mesesDias[1] = 29;
        }
        if (this.mes > 12) {
            return false;
        }
        if (this.dia > mesesDias[this.mes - 1]) {
            return false;
        }
        return true;
    }

    public boolean anoBissexto() {
        return ((this.ano % 4 == 0) && (this.ano % 100 != 0 || this.ano % 400 == 0));
    }

    public String dataFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
