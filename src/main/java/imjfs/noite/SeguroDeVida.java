/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.noite;

/**
 *
 * @author danil
 */
public class SeguroDeVida implements ITributavel{
    
    private final double TAXA = 42.0;
    private double valorSeguro;
    private final double PORCENTAGEM = 0.05;
    
    @Override
    public double calculaTributos(){
        return this.TAXA + this.valorSeguro * this.PORCENTAGEM;
    }
}
