package ex.felipeBoll_vetores;

import java.util.Random;
import java.util.Scanner;

public class random {

    public static Random randon = new Random();
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d]: %d\n", i, array[i]);
        }
    }

    public static int[] inverter(int[] vetor){
        int[] vInvertido = new int[vetor.length];

        for(int i = 0; i < vInvertido.length; i++){
            vInvertido[i] = vetor[vInvertido.length - 1 - i];
        }

        return vInvertido;

    }

    public static int[] trocarValor(int[] vetor, int posicaoA, int posicaoB){

        int[] trocado = new int[vetor.length];

        for(int i = 0; i < trocado.length; i++){
            trocado[i] = vetor[i];
        }

        int auxiliar = trocado[posicaoA];
        trocado[posicaoA] = trocado[posicaoB];
        trocado[posicaoB] = auxiliar;

        return trocado;


    }

    public static int[] obterHistogramaValores_0_9(int[] vetor){
        return null;
    }

    public static int obterIndice(int[] vetor, int valor){
        
        
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor) {
                return i;
            } 
        }

        return -1;

    }

    public static int contarValores(int[] vetor, int valor){
        int contador = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor) {
                contador++;
            }
        }
        return contador;
    }


    public static int[] gerarVetorInteirosAleatorios(int tamanho, int intervalo){
        int[] vetor = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
             vetor[i] = randon.nextInt(intervalo);
             //Desativar para ver os valores do vetor
             System.out.println(vetor[i]);
        }

        return vetor;

    }

    
    public static void main(String[] args) {
        //Random randon = new Random();

        int[] vetor = gerarVetorInteirosAleatorios(5, 4);
        int posicaoA = 1;
        int posicaoB = 4;
        int[] trocado = trocarValor(vetor, posicaoA, posicaoB);
        imprimirArraysInt(trocado);

        /*int[] vetor = gerarVetorInteirosAleatorios(5, 4);
        int[] vInvertido = inverter(vetor);
        imprimirArraysInt(vInvertido);*/


        //int[] vetor = gerarVetorInteirosAleatorios();

        /*int quantidade = 1000;
        int[] vetor = gerarVetorInteirosAleatorios(quantidade, 10);
        int[] histograma = obterHistogramaValores_0_9(vetor);
        imprimirArraysInt(histograma);*/



       /*int[] teste = gerarVetorInteirosAleatorios(25, 10);
       imprimirArraysInt(teste);*/

       
       /*int teste = obterIndice(vetor, 2);
       System.out.println(teste);*/

        /*int[] vetor = gerarVetorInteirosAleatorios(6, 7);
        int teste = contarValores(vetor, 3);
        System.out.println(teste);*/



        /* 
        String[] animais = {"gato", "cachorro", "urso", "cavalo", "onitorrinco", "pato", "tartaruga", "peixe", "calopsita", "capivara"};

        for(int i = 0; i < 3; i++){
            int posicao = randon.nextInt(animais.length);
            System.out.println(animais[posicao]);
        }*/


        /*for(int i = 0; i < 10; i++){
        System.out.println(randon.nextInt(100));
        }*/
    }
    

}
