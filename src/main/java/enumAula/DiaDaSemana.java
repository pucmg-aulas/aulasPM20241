/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumAula;

/**
 *
 * @author danil
 */
public enum DiaDaSemana {
    
    SEG(10,20),
    TER(30,40);
    
    private final int numA;
    private final int numB;
    
    DiaDaSemana(int a, int b){
        this.numA = a;
        this.numB = b;
    }

    public int getNumA() {
        return numA;
    }

    public int getNumb() {
        return numB;
    }
    
    
    
}
