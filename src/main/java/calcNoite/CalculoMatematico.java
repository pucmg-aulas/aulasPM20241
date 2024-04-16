/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcNoite;

/**
 *
 * @author danil
 */
public abstract class CalculoMatematico {
    
    protected double valor1;
    protected double valor2;
    
    public CalculoMatematico(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public abstract double resultado();
    
    public abstract double resultado(boolean inverso);
}
