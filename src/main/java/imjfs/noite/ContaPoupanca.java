/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.noite;

/**
 *
 * @author danil
 */
public class ContaPoupanca extends Conta {
    
    @Override
    public double sacar(float valor){
        if(saldo < valor || valor <= 0){
            return -1;
        }
        saldo -= valor;
        return saldo;
    }
    
    @Override
    public double depositar(float valor){
        if(valor <= 0){
            return -1;
        }
        saldo += valor;
        return saldo;
    }
    
    @Override
    public double obterSaldo(){
        return saldo;
    }
    
}
