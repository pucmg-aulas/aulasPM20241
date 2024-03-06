/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataN;

/**
 *
 * @author danil
 */
public class DataMainN {
    
    public static void main(String[] args) {
        
        DataN data = new DataN(10,3,2024);
   
        //data.ajustarData(10, 03, 2024);
        
        if(data.dataValida()){
            
        }
        
        System.out.println(data.dataFormatada());
        
    }
}
