package ex.felipeBoll_vetores;

import java.util.Scanner;

public class PrimeiroExercicio {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int somaArrayInt(int[] array){
        int soma = 0;
        
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }

        return soma;

    }


    public static void descobrirSomaEMedia(int[] idades){
        int soma = 0;
        
        for(int i = 0; i < idades.length; i++){
            idades[i] = tecladoScanner.nextInt();
        }

        soma = somaArrayInt(idades);

        double media = (double) soma / idades.length;

        System.out.printf("A soma eh: %d\nE a media eh: %.1f", soma, media);

    }
    
    public static void main(String[] args) {
        int quantAlunos = tecladoScanner.nextInt();

        int[] idades = new int[quantAlunos];

        descobrirSomaEMedia(idades);

    }
}
