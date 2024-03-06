/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        Hora hora1 = new Hora(); //entrada
        Hora hora2 = new Hora(); //saida
        
        hora1.setHora(8);
        hora1.setMin(0);
        hora1.setSeg(0);
        
        hora2.setHora(12);
        hora2.setMin(10);
        hora2.setSeg(0);
        
        int horasTrabalhadas = hora2.getHora() - hora1.getHora();
        
        System.out.println(hora1);
        hora1.imprimeHora();
        
        System.out.println("Horas trabalhadas " + horasTrabalhadas);
        System.out.println(hora1.getHora());
    }
    
    
}
