/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package VooN;

import java.util.Date;
import org.junit.jupiter.api.Test;
import sistemaVoo.Piloto;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author danil
 */
public class PilotoTest {
    
    public PilotoTest() {
    }
    
     @Test
     public void proximoCodigoTest() {
     
         Date dataV = new Date(2028, 2, 15);
         Piloto p1 = new Piloto("José", "123", dataV);
         Piloto p2 = new Piloto("Jorge", "456", dataV);
     
         assertEquals(3,p2.getCodigo());
     }
     
     @Test
     public void proxCodigoDisponivel(){
         
         Date dataV = new Date(2028, 2, 15);
         Piloto p3 = new Piloto("Carlos", "123", dataV);
         
         int proxCodigoEsperado = 2;
         
         assertEquals(proxCodigoEsperado, Piloto.getProxCodd());
         
         

     }
}
