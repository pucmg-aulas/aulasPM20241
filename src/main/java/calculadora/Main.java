/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author danil
 */
public class Main {

    public static void main(String[] args) {

        CalculoMatematico c;

        c = new Divisao(10, 20);
        
        // Método sobrescrito de divisão
        c.resultado();
        
        // Método sobrescrito e sobrecarregado
        c.resultado(true);
        
        // Método sobrecarregado em Divosão, 
        //que recebe um divisor externo para dividir a 
        //soma dos valores A e B
        // No entato, precisamos fazer um cast para a Classe
        // Divisao para conseguirmos acessar o novo método
        // Que é exclusivo de Divisão
        Divisao d = (Divisao)c;
        
        d.resultado(3);

    }

}
