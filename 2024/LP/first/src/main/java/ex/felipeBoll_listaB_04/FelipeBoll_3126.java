package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_3126 {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("N[%d] = %d\n", i, array[i]);
        }
    }

    public static int quantosEstavamPresentes(int[] vetor){
        int candidatosPresentes = 0;

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == 1) {
                candidatosPresentes++;
            }
        }

        return candidatosPresentes;

    }
    
    
    public static void main(String[] args) {
        int numeroDeInscritos = tecladoScanner.nextInt();
        int[] vetor = new int[numeroDeInscritos];

        for(int i = 0; i < vetor.length; i++){
            int valor = tecladoScanner.nextInt();
            vetor[i] = valor;
        }

        int candidatosPresentes = quantosEstavamPresentes(vetor);

        System.out.println(candidatosPresentes);


    }
}
