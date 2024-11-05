package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1177 {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("N[%d] = %d\n", i, array[i]);
        }
    }

    public static int[] preencherComIntervalo(int valorDePreenchimento){

        int[] vetor = new int[1000];

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j <= (valorDePreenchimento - 1); j++){
                vetor[i] = j;
            }
        }

        return vetor;
    }
    
    public static void main(String[] args) {
        int valorDePreenchimento = tecladoScanner.nextInt();
        int[] vetor = preencherComIntervalo(valorDePreenchimento);
        imprimirArraysInt(vetor);
        
    }
}
