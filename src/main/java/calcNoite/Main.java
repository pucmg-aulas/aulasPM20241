/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcNoite;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        CalculoMatematico c;
        
        //c.resultado();
        
        //c = new Adicao(1, 2);
        //c = new Subtracao(1, 2);
        c = new Divisao(15, 200);
        //c = new Multiplicacao(2, 3);
        
        System.out.println(c.resultado());
        
        System.out.println(c.resultado(true));
        
        Divisao d = (Divisao)c;
        
        System.out.println(d.resultado("%.2f"));
        
        //c(Divisao).resultado()
        
        
        
        
        
    }
    
}
