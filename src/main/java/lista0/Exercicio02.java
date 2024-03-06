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
public class Exercicio02 {

    /*
    2 - Elabore um programa que preencha com 10 
    elementos do tipo inteiro em um vetor A. Crie 
    um vetor ParImpar de 2 posições e armazene no 
    índice 0 quantos elementos de A são par e no 
    índice 1 quantos elementos de A são ímpar. 
    Ao final, imprima o vetor ParImpar.
     */
    public void run() {

        Scanner s = new Scanner(System.in);

        int TAM = 10;
        int vetor[] = new int[TAM];
        int parImpar[] = new int[2];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Insira o elemento " + (i + 1));
            vetor[i] = s.nextInt();
        }

        for (int i = 0; i < TAM; i++) {

            if (vetor[i] % 2 == 0) {
                parImpar[0] += 1;
            } else {
                parImpar[1] += 1;
            }
        }

        System.out.println("Quantidade de Elementos Pares: " + parImpar[0]);
        System.out.println("Quantidade de Elementos Ímpares: " + parImpar[1]);

    }

}
