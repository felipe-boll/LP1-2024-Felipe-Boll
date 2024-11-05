package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1173 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("N[%d] = %d\n", i, array[i]);
        }
    }

    public static int[] preencherPrimeiraPosicao(int vPrimeiraPosicao){
        int[] vetor = new int[10];
        vetor[0] = vPrimeiraPosicao;

        for(int i = 1; i < vetor.length; i++){
            vPrimeiraPosicao *= 2;
            vetor[i] = vPrimeiraPosicao;

        }

        return vetor;

    }

    public static void main(String[] args) {
        int vPrimeiraPosicao = tecladoScanner.nextInt();
        int[] vetor = preencherPrimeiraPosicao(vPrimeiraPosicao);
        imprimirArraysInt(vetor);

        }
}
