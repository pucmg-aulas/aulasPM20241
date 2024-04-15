/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author danil
 */
public abstract class CalculoMatematico {

    protected double valorA;
    protected double valorB;

    public CalculoMatematico(double valorA, double valorB) {

        this.valorA = valorA;
        this.valorB = valorB;

    }

    public abstract double resultado();

    public abstract double resultado(boolean reverse);

    public static double calcular(CalculoMatematico calculo) {
        return calculo.resultado();
    }

}
