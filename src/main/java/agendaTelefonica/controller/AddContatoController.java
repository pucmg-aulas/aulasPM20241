/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaTelefonica.controller;

import agendaTelefonica.dao.Contatos;
import agendaTelefonica.model.Contato;
import agendaTelefonica.view.AddContatoView;

/**
 *
 * @author danil
 */
public class AddContatoController {
    
    private AddContatoView view;
    private Contatos contatos;
    
    public AddContatoController(){
        
        view = new AddContatoView();
        contatos = Contatos.getInstance();
        
        this.view.getBtnSalvar().addActionListener((e)->{
            addContato();
        });
        
        this.view.getBtnCancelar().addActionListener((e)->{
            cancelar();
        });
        
        this.view.setVisible(true);
        
    }
    
    
    public void addContato(){
        
        String nome = view.getTxtNome().getText();
        String sobrenome = view.getTxtSobrenome().getText();
        int ddd = Integer.valueOf(view.getTxtDDD().getText());
        String numero = view.getTxtNumero().getText();
        
        Contato c = new Contato(nome, sobrenome, ddd, numero);
        contatos.addContato(c);
    }
    
    private void cancelar(){
        this.view.dispose();
    }
    
}
