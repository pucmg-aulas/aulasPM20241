/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.manha;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danil
 */
public class GerenciadorDeImpostoDeRenda {

    private double valorTotalImposto;
    private List<ITributavel> tributos;
    
    //private ContaCorrente cc;
    //private SeguroDeVida sv;
    //private SeguroAuto sa;

    public GerenciadorDeImpostoDeRenda() {
        
        this.valorTotalImposto = 0;
        this.tributos = new ArrayList<>();
        
    }
    
    public void adicionar(ITributavel tributo) {
        tributos.add(tributo);
        calculaTributo();
        //calculaTributo(tributo);
    }

    private void calculaTributo() {

        for (ITributavel tributo : tributos) {
            this.valorTotalImposto += tributo.calculaTributos();
        }
    }

    private void calculaTributo(ITributavel tributo) {

        this.valorTotalImposto += tributo.calculaTributos();

    }

    public double getTotalImpostos() {
        return this.valorTotalImposto;
    }

}
