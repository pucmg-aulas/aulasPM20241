/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaVoo;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author danil
 */
public class Main {

    public static void main(String[] args) {

        //Date d = new Date(2026, 04, 02);
        Piloto p = new Piloto("José", "456789", new Date(2026, 04, 02));
        Piloto p1 = new Piloto("João", "456789", new Date(2026, 04, 02));

        p.getNome();
        
        Piloto.imprimePiloto(p1);
        
        Piloto.getDiasREstanteValidadeRegistro(new Date(2024,05,14));
        
        Main m = new Main();
        

    }

}
