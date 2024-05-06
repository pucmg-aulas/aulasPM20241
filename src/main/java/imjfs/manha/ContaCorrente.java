/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.manha;

/**
 *
 * @author danil
 */
public class ContaCorrente extends Conta implements ITributavel {

    private static final double TAXA_PORCENTAGEM = 0.01;
    
    public ContaCorrente(double saldo){
        super(saldo);
    }
    @Override
    public double calculaTributos(){
        return obterSaldo() * TAXA_PORCENTAGEM;
    }

}
