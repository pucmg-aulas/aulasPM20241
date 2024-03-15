/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpm1103;

/**
 *
 * @author danil
 */
public class Professor {
    
    private String nome;
    private int codigo;
    private String email;
    private double salario;
    
    public Professor(String nome, int codigo, String email, double salario){      
        this.nome = nome;
        this.codigo = codigo;
        this.email = email;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", codigo=" + codigo + ", email=" + email + ", salario=" + salario + '}';
    }

    
    
    
    
}
