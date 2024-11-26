package ex.felipeBoll_matriz;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosMatrix {

    public static Random randon = new Random();
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d]: %d\n", i, array[i]);
        }
    }

    public static int[][] lerMatrizInt(int linhas, int colunas){
        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int  j = 0; j < colunas; j++){
                System.out.printf("Informe o valor [%d] [%d]:", i, j);
                matriz[i][j] = tecladoScanner.nextInt();
            }
        }

        return matriz;
    }

    public static int[] obterDiagonalPrincipal(int[][]matriz, int coluna){
        int[] diagonalPrincipal = new int[coluna];
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    diagonalPrincipal[i] = matriz[i][j];
                }
            }
        }

        return diagonalPrincipal;
    }


    public static int[] obterPosMaiorValor(int[][]matriz){
        int[] posicaoMaior = new int[2];
        int linha = matriz.length;
        int coluna = matriz[0].length;
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    posicaoMaior[0] = i;
                    posicaoMaior[1] = j;
                }
            }
        }

        return posicaoMaior;
    }

    public static int[][] criarCampoMinado(int linhas, int colunas, int quantBombas){
        int[][] campoMinado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                campoMinado[][]
            }
        }
        return campoMinado;
        
    }

    public static void exercicioDiagonal(){
        int quantLinhas = tecladoScanner.nextInt();
        int quantColunas = tecladoScanner.nextInt();
        int[][] matriz = lerMatrizInt(quantLinhas, quantColunas);
        int[] diagonalPrincipal = obterDiagonalPrincipal(matriz, 3);
        imprimirArraysInt(diagonalPrincipal);
    }

    public static void exercicioMaiorPos(){
        int quantLinhas = tecladoScanner.nextInt();
        int quantColunas = tecladoScanner.nextInt();
        int[][] matriz = lerMatrizInt(quantLinhas, quantColunas);
        int[] posicaoMaior = obterPosMaiorValor(matriz);
        imprimirArraysInt(posicaoMaior);
    }

    public static void exercicioCampoMinado(){

    }

    public static void main(String[] args) {
        //exercicioDiagonal();
        //exercicioMaiorPos();
    }
}
