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
public class insertion {
    public static void insertionSort(int[] vetor) {
        int contador = 0;
        int x, j;
        for (int i = 1; i < vetor.length; i++) {
            x = vetor[i];
            j = i - 1;
            contador++;
            while ((j > -0) && vetor[j] > x) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = x;
        }
        System.out.println(" \nVetor   Insertion: " + Arrays.toString(vetor));
        System.out.println(" -- > Comparações  Insertion:  " + contador);
    }
}
