/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcNoite;

import java.net.CacheRequest;

/**
 *
 * @author danil
 */
public class Multiplicacao extends CalculoMatematico{

    public Multiplicacao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public double resultado() {
        return this.valor1 * this.valor2;
    }
    
    @Override
    public double resultado(boolean inverso) {
        return inverso?(this.valor2 * this.valor1):resultado();
    }
    
    
    
    
}
