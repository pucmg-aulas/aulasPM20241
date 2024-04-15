/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author danil
 */
public class Divisao extends CalculoMatematico{

    public Divisao(double valorA, double valorB) {
        super(valorA, valorB);
    }
    
    @Override
    public double resultado() {
        return this.valorA/this.valorB;
    }

    @Override
    public double resultado(boolean reverse) {
        return (reverse)? this.valorB/this.valorA:resultado();
    }
    
    //Divisao da soma dos numeros por um divisor externo
    public double resultado(double divisor){
        return (this.valorA+this.valorB)/divisor;
    }
    
}
