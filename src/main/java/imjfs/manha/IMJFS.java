/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imjfs.manha;

/**
 *
 * @author danil
 */
public class IMJFS {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(1000);
        SeguroDeVida sv = new SeguroDeVida(100000);
        
        //SeguroAuto sa = new SeguroAuto();
        
        GerenciadorDeImpostoDeRenda girpf = new GerenciadorDeImpostoDeRenda();
        girpf.adicionar(sv);
        girpf.adicionar(cc);
        //girpf.adicionar(sa);
               
        
        
        System.out.println("Total de Impostos: " + girpf.getTotalImpostos());
        
    }
    
}
