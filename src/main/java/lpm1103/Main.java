/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpm1103;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        Professor p = new Professor("Danilo", 1449036, "daniloboechat@pucminas.br", 10000000.00);
        Professor p1 = new Professor("Laerte", 144678, "laerte@pucminas.br", 30000000.00);
        
        
        System.out.println(p);
        
        Curso c = new Curso(1, "ES", "Engenharia de Software", 3800, p1);
        
        c.getCoordenador();
    }
    
}
