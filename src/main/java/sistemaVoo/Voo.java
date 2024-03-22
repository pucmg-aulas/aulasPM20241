/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaVoo;

import java.time.LocalTime;

/**
 *
 * @author danil
 */
public class Voo {
    private static final int MAX_PASSAGEIROS = 250;
    private int numero;
    private LocalTime horaPartida;
    private LocalTime horaChegada;
    private String localPartida;
    private String localDestino;
    private Piloto piloto;
    private Piloto copiloto;
    private Passagem[] passagens;
    
    
    public Voo(int numero, LocalTime horaPartida, LocalTime horaChegada, String localPartida, String localDestino){
        this.passagens = new Passagem[MAX_PASSAGEIROS];
        this.numero = numero;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.localDestino = localDestino;
        this.localPartida = localPartida;      
    }
   
    public int vagasDisponiveis(){
        
        int count = 0;
        
        for (int i = 0; i < MAX_PASSAGEIROS; i++) {
            if(this.passagens[i] == null){
                break;
            }
            count++;
        }
        return count;
    }
}
