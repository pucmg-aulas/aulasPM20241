/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaVoo;

import java.util.Date;

/**
 *
 * @author danil
 */
public class Piloto {
    
    private static int proxCod = 1;
    
    private int codigo;
    private String nome;
    private String numeroRegistro;
    private Date dataValidadeRegistro;
    
    public Piloto(String nome, String numeroRegistro, Date dataValidadeRegistro){
        this.codigo = this.getProxCodigo();
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.dataValidadeRegistro = dataValidadeRegistro;
    }
    
    private int getProxCodigo(){
        return proxCod++;
    }

    public static int getProxCodd() {
        return proxCod;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    
    public String getNome() {
        return nome;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public Date getDataValidadeRegistro() {
        return dataValidadeRegistro;
    }
    
    public static void imprimePiloto(Piloto piloto){
        System.out.println(piloto.nome + "\t" + piloto.dataValidadeRegistro);
    }
    
    public static int getDiasREstanteValidadeRegistro(Date dataValidade){
        
        return 1;
        
    }

    @Override
    public String toString() {
        return "Piloto{" + "codigo=" + codigo + ", nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", dataValidadeRegistro=" + dataValidadeRegistro + '}';
    }
    
    
}
