/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author Gabri
 */
public class heap extends apspota {

    public static int contadorheap;

    public static void heapSort(int[]v){

        buildMaxHeap(v);  
          int n = v.length;

        for (int i = v.length -1; i > 0; i--) {
            swap(v,i,0);
            maxHeapify(v,0,--n);
        }
        
    }

    private static  void buildMaxHeap(int[]v){
        for (int i = v.length/2-1; i >= 0; i--) {
            maxHeapify(v,i,v.length);
        }

    }

    private static void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor) {

        int max = 2*pos + 1, right = max + 1;
        contadorheap++;
        if (max < tamanhoDoVetor) {
            contadorheap++;
            if (right < tamanhoDoVetor && vetor[max] < vetor[right]) {
                max = right;
            }
            contadorheap++;
            if (vetor[max] > vetor[pos]) {
                swap(vetor, max, pos);
                maxHeapify(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public static void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
}
