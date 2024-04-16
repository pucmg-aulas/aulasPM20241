/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcNoite;

import java.text.DecimalFormat;
import java.util.Formatter;

/**
 *
 * @author danil
 */
public class Divisao extends CalculoMatematico {

    public Divisao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public double resultado() {
        return this.valor1 / this.valor2;
    }
    

    @Override
    public double resultado(boolean inverso) {
        return inverso ? (this.valor2 / this.valor1) : resultado();
    }

    //("#.##");
    public double resultado(String casasDecimais) {
        //DecimalFormat formato = new DecimalFormat(casasDecimais);
        //String.format("%.2f", valor);

        return Double.parseDouble(String.format(casasDecimais,(this.valor1 / this.valor2)));

    }
    
  
    

}
