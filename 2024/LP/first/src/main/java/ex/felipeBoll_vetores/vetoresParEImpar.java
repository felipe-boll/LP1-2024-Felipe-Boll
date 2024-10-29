package ex.felipeBoll_vetores;

import java.util.Scanner;

public class vetoresParEImpar {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d]: %d\n", i, array[i]);
        }
    }

    public static int[] contarParEImpar(int[] numeros){
        int[] vCont = {0, 0};
        
        for(int i = 0; i < numeros.length; i++){
            
            vCont[numeros[i] %2]++;

        }

        return vCont;
    }

    public static void main(String[] args) {
        int[] numeros = {9, 4, 3, 8, 6};

        int[] vCont = contarParEImpar(numeros);

        imprimirArraysInt(vCont);

    }
}
