/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

import static aps.bubble.bubbleSort;
import static aps.bucket.bucketSort;
import static aps.count.countSort;
import static aps.heap.contadorheap;
import static aps.heap.heapSort;
import static aps.insertion.insertionSort;
import static aps.merge.contadormerge;
import static aps.merge.mergeSort;
import static aps.quick.contadorquick;
import static aps.quick.quickSort;
import static aps.radix.radixsort;
import static aps.selection.selectionSort;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabri
 */
class apspota {

    
    

    public static void main(String[] args) throws IOException {
        //Scanner  e entrada  do tamanho  dos  vetores  
        Scanner entrada = new Scanner(System.in);
        int numAleatorio;
        System.out.println("Insira o  tamanho do   vetor : ");
        numAleatorio = entrada.nextInt();

        //Classe para gerar o  vetor  com a quantidade de elementos  escolhida  
        int[] v = gerar(numAleatorio);

        System.out.println(" \nVetor Inicial: " + Arrays.toString(v));
        bubbleSort(v);
        selectionSort(v);
        insertionSort(v);
        heapSort(v);
        System.out.println(" \nVetor  Heap:  " + Arrays.toString(v));
        System.out.println(" -- > Comparações  Heap: " + contadorheap);
        
        int i = 0;
        int f = v.length;
        int max = 10000;
        
        mergeSort(v, i, f);
        System.out.println(" \nVetor  Merge :" + Arrays.toString(v));
        System.out.println(" -- > Comparações  Merge:  " + contadormerge);
        
        quickSort(v, 0, v.length - 1);
        System.out.println(" \nVetor  Quick:  " + Arrays.toString(v));
        System.out.println(" -- > Comparações  Quick: " + contadorquick);
        
        countSort(v);
       
        radixsort(v,f);
        
        bucketSort(v,max);
    }


    public static int[] gerar(int n) {
        int numero;
        int[] num = new int[n];
        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            numero = r.nextInt(10000) + 1;
            for (int j = 0; j < num.length; j++) {
                if (numero == num[j] && j != i) {
                    numero = r.nextInt(10000) + 1;
                } else {
                    num[i] = numero;
                }
            }
        }
        return num;
    }
}

