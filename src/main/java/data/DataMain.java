/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author danil
 */
public class DataMain {

    public static void main(String[] args) {

        //Data data = new Data();
        Data data = new Data(4,3,2024);

        System.out.println(data.dataFormatada());

        data.ajustarData(14, 10, 0);

        System.out.println(data.dataFormatada());
        
        System.out.println(data.dataValida());

    }

}
