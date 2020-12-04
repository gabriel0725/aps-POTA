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
public class bucket {
    public static int contadorbalde;
    public static void bucketSort(int[] vetor, int maxVal) {
        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
            
        }

        for (int i = 0; i < vetor.length; i++) {
            bucket[vetor[i]]++;
            
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                vetor[outPos++] = i;
                
            }
            contadorbalde++;
        }
         System.out.println(" \nVetor   Bucket: " + Arrays.toString(vetor));
        System.out.println(" -- > Comparações  Bucket:  " + contadorbalde);
    }
}
