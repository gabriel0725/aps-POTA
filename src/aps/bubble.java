/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

import java.util.Arrays;

/**
 *
 * @author Gabri
 */
public class bubble extends apspota{

    public static void bubbleSort(int[] vetor) {
        int aux;
        int contadorbubble = 0;
        boolean controle;

        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (int j = 0; j < (vetor.length - 1); j++) {
                contadorbubble++;
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }

        System.out.println("\nVetor  Bubble:" + Arrays.toString(vetor));
        System.out.println(" -- > Comparações Bubble : " + contadorbubble);
    }
}
