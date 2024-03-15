/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import data.Data;
/**
 *
 * @author danil
 */
public class DataTest {
    
    public DataTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void criarDataDiaMesMenor10() {
         String dataEsperada = "06/03/2024";
         Data d = new Data(06, 03, 2024);
         String dataRetornada = d.dataFormatada();
         
         assertEquals(dataEsperada, dataRetornada);
     }
     
     @Test
     public void criarDataDiaMenor10MesMaior10(){
         Data d = new Data(6,11,2024);
         String dataEsperada = "06/11/2024";
         String dataRetornada = d.dataFormatada();
         
         assertEquals(dataEsperada, dataRetornada);
     }
     
     @Test
     public void criarDataMesMenor10DiaMaior10(){
         Data d = new Data(14,3,2024);
         String dataEsperada = "14/03/2024";
         String dataRetornada = d.dataFormatada();
         
         assertEquals(dataEsperada, dataRetornada);
     }
     
     @Test
     public void criarDataMesDiaMaior10(){
         Data d = new Data(14,12,2024);
         String dataEsperada = "14/12/2024";
         String dataRetornada = d.dataFormatada();
         
         assertEquals(dataEsperada, dataRetornada);
     }
 
     @Test
     public void anoDeSeculoBissexto(){
         Data data = new Data(1, 2, 2000);
         boolean resultadoEsperado = true;
         
         boolean resultadoRetornado = data.eBissexto();
         
         assertEquals(resultadoEsperado, resultadoRetornado);
     }
     
     @Test
     public void anoDeSeculoNaoBissexto(){
         Data data = new Data(1, 2, 1900);
         boolean resultadoEsperado = false;
         
         boolean resultadoRetornado = data.eBissexto();
         
         assertEquals(resultadoEsperado, resultadoRetornado);
     }
     
     @Test
     public void anoNaoSecularBissexto(){
         Data data = new Data(1, 2, 2024);
         boolean resultadoEsperado = true;
         
         boolean resultadoRetornado = data.eBissexto();
         
         assertEquals(resultadoEsperado, resultadoRetornado);
     }
     
     @Test
     public void anoNaoSecularNaoBissexto(){
         Data data = new Data(1, 2, 2023);
         boolean resultadoEsperado = false;
         
         boolean resultadoRetornado = data.eBissexto();
         
         assertEquals(resultadoEsperado, resultadoRetornado);
     }
     
     @Test
     public void fevereiroDiaMaior29(){
         
         Data d = new Data(30,2,2024);
         boolean esperado = false;
         boolean inserido = d.dataValida();
         
         assertEquals(esperado,inserido);
     }
     
     @Test
     public void fevereiroDia29Bissexto(){
         
         Data d = new Data(29,2,2024);
         boolean esperado = true;
         boolean inserido = d.dataValida();
         
         assertEquals(esperado,inserido);
     }
     
     @Test
     public void fevereiroDia29NaoBissexto(){
         
         Data d = new Data(29,2,2023);
         boolean esperado = false;
         boolean inserido = d.dataValida();
         
         assertEquals(esperado,inserido);
     }
     
     @Test
     public void criarDataAnoNegativo(){
         
         Data dataNaoEsperada = new Data(29,2,2024);
         Data dataCriada = new Data(29,2,-2024);
                 
         
         assertNotEquals(dataNaoEsperada,dataCriada);
     }
}
     


