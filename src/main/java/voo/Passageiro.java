/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voo;

/**
 *
 * @author danil
 */
public class Passageiro {

    private String nome;
    private int rg;
    private String telefone;
    private String endereco;

    public Passageiro(String nome, int rg, String telefone, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public void atualizaCadastro(String telefone, String endereco){
        
        this.telefone = telefone;
        this.endereco = endereco;
        
    }

}
