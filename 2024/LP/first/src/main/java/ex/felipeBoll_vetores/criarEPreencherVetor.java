package ex.felipeBoll_vetores;

import java.util.Scanner;

public class criarEPreencherVetor {
    
    public static Scanner tecladoScanner = new Scanner(System.in);
    
    public static int[] lerVetoresInteiros(int quantidade){

        int[] array = new int[quantidade];

        for(int i = 0; i < array.length; i++){
            System.out.println("Informe um valor inteiro");
            int valor = tecladoScanner.nextInt();
            array[i] = valor;
            System.out.printf("[%d]: %d\n", i, valor);
        }

        return array;

    }
    
    public static void main(String[] args) {
        
        int quantidade = 10;
        int[] valores = lerVetoresInteiros(quantidade);    
    }
}
