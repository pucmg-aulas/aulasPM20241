/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.noite;

/**
 *
 * @author danil
 */
public abstract class Conta {
    protected float saldo;
    
    public abstract double sacar(float valor);
    public abstract double depositar(float valor);
    public abstract double obterSaldo();
    
}
