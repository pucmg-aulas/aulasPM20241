/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.manha;

/**
 *
 * @author danil
 */
public abstract class Conta {
    
    private double saldo;
    
    public Conta (double saldo){
        this.saldo = saldo;        
    }
    public double obterSaldo(){
     return this.saldo;   
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public double sacar(double valor){
        this.saldo -= valor;  
        return obterSaldo();
    }
    
}
