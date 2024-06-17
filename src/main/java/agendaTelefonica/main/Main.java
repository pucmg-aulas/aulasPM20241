/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaTelefonica.main;

import agendaTelefonica.controller.AddContatoController;
import agendaTelefonica.dao.Contatos;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        Contatos contatos =  Contatos.getInstance();
        
        //Contato c = new Contato("A", "b", 22, "34567890");
        //contatos.addContato(c);
        
        new AddContatoController();
        
    }
    
}
