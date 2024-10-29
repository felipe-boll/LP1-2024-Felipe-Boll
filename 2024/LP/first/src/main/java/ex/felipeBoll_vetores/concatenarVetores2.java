package ex.felipeBoll_vetores;

import java.util.Scanner;

public class concatenarVetores2 {
   
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d]: %d\n", i, array[i]);
        }
    }


    public static int[] concatenar3Vetores(int[] v1, int[] v2, int[] v3) {
        
        int tamanhoFinal = v1.length + v2.length;
        int[] vConcat = new int[tamanhoFinal];

        for(int i=0; i < v1.length; i++){
            vConcat[i] = v1[i];
        }

        for(int i = 0; i < v2.length; i++){
            vConcat[i + v1.length] = v2[i];
        }

        for(int i = 0; i < v3.length; i++){
            vConcat[v1.length + v2.length + i] = v3[i];
        }

        return vConcat;

    }
    
    public static void main(String[] args) {

        int[] v1 = {1, 2, 3, 4};
        int[] v2 = {5, 6};
        int[] v3 = {7, 8};
        int[] vConcat = concatenar3Vetores(v1, v2, v3);

        imprimirArraysInt(vConcat);

    }
}
