package ex.felipeBoll_vetores;

import java.util.Scanner;

public class concatenarVetores1 {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d]: %d\n", i, array[i]);
        }
    }


    public static int[] concatenar2Vetores(int[] v1, int[] v2) {
        
        int tamanhoFinal = v1.length + v2.length;
        int[] vConcat = new int[tamanhoFinal];

        for(int i=0; i < v1.length; i++){
            vConcat[i] = v1[i];
        }

        for(int i = 0; i < v2.length; i++){
            vConcat[i + v1.length] = v2[i];
        }

        return vConcat;

    }
    
    public static void main(String[] args) {

        int[] v1 = {1, 2, 3, 4};
        int[] v2 = {5, 6};
        int[] vConcat = concatenar2Vetores(v1, v2);

        imprimirArraysInt(vConcat);

    }
}
