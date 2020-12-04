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
public class merge {
    public static int contadormerge = 0;
     public static void mergeSort(int[] vet, int i, int f) {
        contadormerge++;
        if (i < f) {
            int m = (i + f) / 2;
            mergeSort(vet, i, m);
            mergeSort(vet, m + 1, f);
            intercala(vet, i, m, f);
        }
    }

    public static void intercala(int[] vet, int i, int m, int f) {
        int vet2[] = new int[vet.length];
        for (int j = i; j <= m; j++) {
            vet2[j] = vet[j];
        }
        for (int g = m + 1; g < f; g++) {
            vet2[f + m - g] = vet[g];
        }
        int x = i;
        int z = f - 1;

        for (int k = i; k < f; k++) {
            contadormerge++;
            if (vet2[x] <= vet2[z]) {
                vet[k] = vet2[x];
                x = x + 1;
            } else {
                vet[k] = vet2[z];
                z = z - 1;
            }
        }
       

    }
    
}
