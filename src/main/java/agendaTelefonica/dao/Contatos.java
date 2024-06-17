/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaTelefonica.dao;

import agendaTelefonica.model.Contato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danil
 */
public class Contatos extends AbstractDAO{

    private List<Contato> contatos;
    private static Contatos instance; 
    private String path;

    private Contatos() {
        this.contatos = new ArrayList<>();
        carregarContatos();
    }
    
    public static Contatos getInstance(){
        if(instance == null)
            instance = new Contatos();
        return instance;
    }
    
    public void addContato(Contato contato) {
        contatos.add(contato);
        gravar(path, contatos);
    }

    public Contato buscarContato(String nome, String sobrenome) {

        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome) && contato.getSobrenome().equals(sobrenome)) {
                return contato;
            }
        }
        //Melhor Tratar Exception
        return null;
    }

    public Contato buscarContato(String numero) {
        for (Contato contato : contatos) {
            if (contato.getNumero().equals(numero)) {
                return contato;
            }
        }
        return null;
    }
    
    public void removerContato(Contato contato){
        contatos.remove(contato);
        gravar(path, contatos);
    }
    
    public void carregarContatos(){
        contatos.addAll(recuperar(path));
    }
}
