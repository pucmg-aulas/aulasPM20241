/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.manha;

/**
 *
 * @author danil
 */
public class SeguroDeVida implements ITributavel{
    
    private static final double TAXA_PORCENTAGEM = 0.05;
    private static final double TAXA_FIXA = 42;
    
    private double valorSegurado;

    public SeguroDeVida(double valorSegurado) {
        this.valorSegurado = valorSegurado;
    }

    @Override
    public double calculaTributos() {
        return (this.valorSegurado*TAXA_PORCENTAGEM) + TAXA_FIXA;
    }
    
    
    
    
    
}
