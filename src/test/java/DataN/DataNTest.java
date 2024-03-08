/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DataN;

import dataN.DataN;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danil
 */
public class DataNTest {

    public DataNTest() {
    }

    @Test
    public void anoNaoBissextoTeste() {

        DataN naoBissexto = new DataN(07, 03, 2023);
        boolean resultadoEsperado = false;
        boolean resultadoObtido = naoBissexto.anoBissexto();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void anoBissextoTeste() {
        DataN anoBissexto = new DataN(07, 03, 2024);
        boolean resultadoEsperado = true;
        boolean resultadoObtido = anoBissexto.anoBissexto();

        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
    @Test
    public void anoDeSeculoNaoBissexto(){
        DataN anoBissexto = new DataN(07, 03, 1500);
        boolean resultadoEsperado = false;
        boolean resultadoObtido = anoBissexto.anoBissexto();

        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
     @Test
    public void anoDeSeculoBissexto(){
        DataN anoBissexto = new DataN(07, 03, 2000);
        boolean resultadoEsperado = true;
        boolean resultadoObtido = anoBissexto.anoBissexto();

        assertEquals(resultadoEsperado, resultadoObtido);
    }
    
    @Test
    public void dataFormatadaMesMenor10(){
        DataN d = new DataN(07,03,2024);
        String dataEsperada = "07/03/2024";
        String dataFormatada = d.dataFormatada();
        
        assertEquals(dataEsperada, dataFormatada);
                
    }
    
    @Test
    public void dataFormatadaMesMaior10(){
        DataN d = new DataN(07,03,2024);
        String dataEsperada = "07/11/2024";
        String dataFormatada = d.dataFormatada();
        
        assertEquals(dataEsperada, dataFormatada);
             
        
    }
    
}
