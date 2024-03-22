/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaVoo;

/**
 *
 * @author danil
 */
public class Passagem {
    
    private int nmrCadeira;
    private float volBagagem;
    private Passageiro passageiro;
    
    
    public Passagem(Passageiro passageiro,float volBagagem,int nmrCadeira){
        this.passageiro = passageiro;
        this.volBagagem = volBagagem;
        this.nmrCadeira = nmrCadeira;
    }
}
