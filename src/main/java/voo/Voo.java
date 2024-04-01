/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voo;

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
    private String localChegada;
    private Piloto piloto;
    private Piloto copiloto;
    private Passagem passagens[];

    public Voo(int numero, LocalTime horaPartida, LocalTime horaChegada, String localPartida, String localChegada) {
        this.numero = numero;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.passagens = new Passagem[MAX_PASSAGEIROS];
    }

    public void adicionarPiloto(Piloto piloto){
        this.piloto = piloto;
    }
    
    public void adicionarCopiloto(Piloto piloto){
        this.copiloto = piloto;
    }
    
    public boolean adicionarPassageiro(Passageiro passageiro, int assento, float volumeBagagem) {

        if (assentoDisponivel(assento)) {
            Passagem passagem = new Passagem(assento, volumeBagagem, passageiro);
            this.passagens[assento] = passagem;
            return true;
        }
        else
            return false;

    }

    public int verificarAssentosDisponiveis() {
        //TODO
        return 0;
    }

    private boolean assentoDisponivel(int assento) {

        if (passagens[assento] == null) {
            return true;
        }
        return false;

    }

}
