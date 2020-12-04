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
public class selection extends apspota {

    public static void selectionSort(int[] vetor) {
        int contador = 0;
        for (int i = 0; i < vetor.length;i++){  
                  int menor = i;

            for (int j = i + 1; j < vetor.length; j++){
                contador++;
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }

            }
            mudar(vetor, i, menor);

        }
        System.out.println(" \nVetor Selection:  " + Arrays.toString(vetor)) ;  
              System.out.println("-->  Comparações Selection:" + contador);

    }

    public static void mudar(int[] vetor,  int i, int menor

    
        )  {  
          int aux = vetor[i];
        vetor[i] = vetor[menor];
        vetor[menor]  =  aux;
    }
}
