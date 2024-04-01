/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voo;

import java.util.Date;

/**
 *
 * @author danil
 */
public class Piloto {
    
    private String nome;
    private String numeroRegisro;
    private Date validadeRegistro;

    public Piloto(String nome, String numeroRegisro, Date validadeRegistro) {
        this.nome = nome;
        this.numeroRegisro = numeroRegisro;
        this.validadeRegistro = validadeRegistro;
    }
    
    public boolean verificaValidadeRegistro(){
        //TODO
        return true;
    }
}
