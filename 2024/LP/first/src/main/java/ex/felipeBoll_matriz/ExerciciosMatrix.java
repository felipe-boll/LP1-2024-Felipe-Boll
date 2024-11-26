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
                
            }
        }
        return campoMinado;
        
    }

    public static int somaMatrizInt(int[][] matriz){
        int soma = 0;
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for(int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }

    public static int[] somarLinhasMatrizInt(int[][] matriz){
        int linhas = matriz.length;
        int[] somaLinha = new int[linhas];
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaLinha[i] += matriz[i][j];
            }
        }

        return somaLinha;
    }

    public static int[] somarColunasMatrizInt(int[][] matriz){
        int colunas = matriz[0].length;
        int linhas = matriz.length;
        int[] somaColunas = new int[colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        return somaColunas;
    }

    public static int[] obterLinha(int[][]matriz, int linha){
        int colunas = matriz[0].length;
        int[] linhaDesejada = new int[matriz.length];

        for (int j = 0; j < colunas; j++) {
                linhaDesejada[j] = matriz[linha][j];
        }

        return linhaDesejada;
    }

    public static int[] obterColuna(int[][]matriz, int coluna){
        int linha = matriz.length;
        int[] colunaDesejada = new int[matriz[0].length];

        for (int i = 0; i < linha; i++) {
                colunaDesejada[i] = matriz[i][coluna];
        }

        return colunaDesejada;
    }

    public static multiplicarMatriz(int[][] matriz, int valorMult){
        
    }

    public static void somaMatriz(){
        int[][] matriz = lerMatrizInt(4, 3);
        int somaMatrizInt = somaMatrizInt(matriz);
        System.out.println(somaMatrizInt);
    }

    public static void somaLinhas(){
        int[][] matriz = lerMatrizInt(4, 3);
        int[] somaLinha = somarLinhasMatrizInt(matriz);
        imprimirArraysInt(somaLinha);
    }

    public static void somaColunas(){
        int[][] matriz = lerMatrizInt(4, 3);
        int[] somaColunas = somarColunasMatrizInt(matriz);
        imprimirArraysInt(somaColunas);
    }

    public static void obterLinha(){
        int quantLinhas = tecladoScanner.nextInt();
        int quantColunas = tecladoScanner.nextInt();
        int linha = tecladoScanner.nextInt();
        int[][] matriz = lerMatrizInt(quantLinhas, quantColunas);
        int[] linhaDesejada = obterLinha(matriz, linha);
        imprimirArraysInt(linhaDesejada);
    }

    public static void obterColuna(){
        int quantLinhas = tecladoScanner.nextInt();
        int quantColunas = tecladoScanner.nextInt();
        int coluna = tecladoScanner.nextInt();
        int[][] matriz = lerMatrizInt(quantLinhas, quantColunas);
        int[] colunaDesejada = obterColuna(matriz, coluna);
        imprimirArraysInt(colunaDesejada);
    }

    public static void multiplicarMatriz(){

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
        //somaMatriz();
        //somaLinhas();
        //somaColunas();
        //obterLinha();
        //obterColuna();
        //exercicioDiagonal();
        //exercicioMaiorPos();
    }
}
