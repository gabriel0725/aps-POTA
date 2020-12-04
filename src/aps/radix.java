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
public class radix {
    static int contadoradix = 0;
    static int getMax(int[] vetor, int n) 
    { 
        int mx = vetor[0]; 
        for (int i = 1; i < n; i++) 
            if (vetor[i] > mx) 
                mx = vetor[i]; 
        return mx; 
    } 
  
    static void countSort(int[] vetor, int n, int exp) 
    { 
        int output[] = new int[n]; 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
        
       
        for (i = 0; i < n; i++){ 
            count[(vetor[i] / exp) % 10]++;
            
        }
  
        for (i = 1; i < 10; i++){ 
            count[i] += count[i - 1]; 
            
        }
  
       
        for (i = n - 1; i >= 0; i--) { 
            output[count[(vetor[i] / exp) % 10] - 1] = vetor[i]; 
            count[(vetor[i] / exp) % 10]--; 
            
        } 
  
        for (i = 0; i < n; i++){ 
            vetor[i] = output[i];
            
    } 
    }
  
 
    static void radixsort(int[] vetor, int n){ 
        
        int m = getMax(vetor, n); 
 
        for (int exp = 1; m / exp > 0; exp *= 10){
            countSort(vetor, n, exp);
            contadoradix++;
        } 
        System.out.println(" \nVetor  radix:  " + Arrays.toString(vetor));
        System.out.println(" -- > Comparações  radix: " + contadoradix);   
    } 
}

