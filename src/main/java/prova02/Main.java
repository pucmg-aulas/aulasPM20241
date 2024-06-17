/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova02;

/**
 *
 * @author danil
 */
public class Main {

    public static void main(String[] args) {

        //Linha 1: Declarou uma nova instância de Caminhão();
        Caminhao caminhao = new Caminhao();  // linha 1

        caminhao.acelerar();
        //Linha 2: Caminhão extende (extends) QuatroRodas 
        //que por sua vez implementa IVeiculo e 
        //consequentemente deve implementar todas as 
        //métodos dessa interface   
        IVeiculo veiculo = caminhao;  // linha 2

        veiculo.frear();
        //Linha 3: Guindaste extende QuatroRodas, 
        //logo não teremos erros;
        QuatroRodas fw = new Guindaste();  // linha 3

        //Linha 4: Não podemos converter veiculo (IVeiculo) 
        //em QuatroRodas (fw) porque QuatroRodas 
        //não é uma superinterface de IVeiculo
       // fw = veiculo;  // linha 4

        veiculo = fw;  // linha 5
    }

}
