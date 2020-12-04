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
public class count {
    public static int contadorCount;
    static void countSort(int[] vetor) 
    { 
        
       
        int max = Arrays.stream(vetor).max().getAsInt(); 
        int min = Arrays.stream(vetor).min().getAsInt(); 
        int range = max - min + 1; 
        int count[] = new int[range]; 
        int output[] = new int[vetor.length]; 
        
        for (int i = 0; i < vetor.length; i++) { 
            count[vetor[i] - min]++;
            
            
        } 
  
        for (int i = 1; i < count.length; i++) { 
            count[i] += count[i - 1]; 
            contadorCount++;
        } 
  
        for (int i = vetor.length - 1; i >= 0; i--) { 
            output[count[vetor[i] - min] - 1] = vetor[i]; 
            count[vetor[i] - min]--; 
            
        } 
  
        for (int i = 0; i < vetor.length; i++) { 
            vetor[i] = output[i]; 
           
        } 
         System.out.println(" \nVetor  count:  " + Arrays.toString(vetor));
        System.out.println(" -- > Comparações  count: " + contadorCount);
    } 
  
}
