/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**
 *
 * @author danil
 */
public class Hora {
    
    private int hora;
    private int min;
    private int seg;

    
    public void setHora(int hora){
        if(hora >= 0 && hora < 24)
            this.hora = hora;
        else
            System.out.println("Não podjeee");
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    public int getHora(){
        return this.hora;
    }
    
    @Override
    public String toString() {
        return  hora + ":" + min + ":" + seg;
    }
    
  
    
    public void imprimeHora(){
        
        System.out.println(this.hora + this.min + this.seg);
    
    }
    
}
