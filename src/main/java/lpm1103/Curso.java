/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpm1103;

/**
 *
 * @author danil
 */
public class Curso {
    
    private int codigo;
    private String sigla;
    private String nome;
    private int cargaHoraria;
    private Professor coordenador;
    private Professor[] professores;
    
    public Curso(int codigo, String sigla, String nome, int cargaHoraria, Professor coordenador){
        this.codigo = codigo;
        this.sigla = sigla;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.coordenador = coordenador;   
    }
    
    public Professor getCoordenador(){
        return this.coordenador;
    }
    
    
}
