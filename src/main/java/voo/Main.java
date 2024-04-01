/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author danil
 */
public class Main {
    
    private static Piloto[] pilotos = new Piloto[10000];
    
    public static void main(String[] args) {
        Voo v = new Voo(1, LocalTime.of(12, 20), LocalTime.MAX, "CNF", "VIX");
        
        
        Piloto p = new Piloto("oiahduad", "fghjk", new Date("56789"));
        pilotos[0] = p;
        
        
        v.adicionarPiloto(p);
    }
    
}
