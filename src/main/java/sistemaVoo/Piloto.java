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
    private String nome;
    private String numeroRegistro;
    private Date dataValidadeRegistro;
    
    public Piloto(String nome, String numeroRegistro, Date dataValidadeRegistro){
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.dataValidadeRegistro = dataValidadeRegistro;
    }
    
}
