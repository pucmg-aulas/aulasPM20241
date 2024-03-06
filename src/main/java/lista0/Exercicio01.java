/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista0;

import java.util.Scanner;

/**
 *
 * @author danil
 */
public class Exercicio01 {
    
     /* 
    
    1 - Faça um programa que leia um vetor A 
    com 15 elementos inteiros. Em seguida, 
    construa um vetor B do mesmo tipo, em que 
    cada elemento de B deva ser o resultado do 
    fatorial correspondente de cada elemento de A. 
    Imprima na tela os vetores A e B.

     */
    
    public void run(){
        
        int TAM = 3;
        Scanner s = new Scanner(System.in);

        int vetorA[] = new int[TAM];
        int vetorB[] = new int[TAM];

        for (int i = 0; i < TAM; i++) {

            System.out.println("Insira o elemento " + (i + 1));
            int valor = s.nextInt();
            vetorA[i] = valor;

        }

        System.out.println("Elementos do Vetor A: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(vetorA[i] + " ");
        }

        for (int i = 0; i < TAM; i++) {
            int numero = vetorA[i];
            int fat = 1;

            for (int j = 2; j <= numero; j++) {
                fat *= j;
            }
            vetorB[i] = fat;
        }

        System.out.println("\nElementos do Vetor b: ");

        for (int i = 0; i < TAM; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
    
}
