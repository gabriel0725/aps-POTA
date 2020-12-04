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
public class quick {
    public static int contadorquick = 0;
    public static int quickSort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            contadorquick++;
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        return contadorquick;
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            contadorquick++;
            if (vetor[i] <= pivo) {
                contadorquick++;
                i++;
            } else if (pivo < vetor[f]) {

                f--;
            } else {

                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

}
