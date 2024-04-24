/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesM;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        IAceleravel a = new Carro();
        
        a.acelerar();
        
        Carro c = (Carro)a;
        
        c.frear();
        
        Bike b = new Bike();
        
        TelaJogo tela = new TelaJogo();
        
        //tela.acelera(b);
       
    
    }
     
    
}
