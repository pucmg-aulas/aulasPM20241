/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author danil
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        ajustarData(dia, mes, ano);
    }

    public boolean eBissexto() {
        if (this.ano % 400 == 0) {
            return true;
        } else if (this.ano % 100 == 0) {
            return false;
        } else if (this.ano % 4 == 0) {
            return true;
        }
        return false;
    }

    public boolean dataValida() {
        int[] tamanho = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (this.ano <= 0 || this.mes <= 0 || this.dia <= 0) {
            return false;
        }

        if (this.mes > 12 || this.dia > 31) {
            return false;
        }

        if (this.dia > tamanho[this.mes - 1]) {
            return false;
        }
        if (!eBissexto() && this.mes == 2 && this.dia > 28) {
            return false;
        }

        return true;

    }

    public void ajustarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (dataValida()) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public String dataFormatada() {
        String ddia = String.valueOf(this.dia);
        String mmes = String.valueOf(this.mes);
        if(this.dia<10){
             ddia = "0"+this.dia;
        }
        if(this.mes<10){
             mmes = "0"+this.mes;
        }
        return ddia + "/" + mmes + "/" + ano;
    }

}
