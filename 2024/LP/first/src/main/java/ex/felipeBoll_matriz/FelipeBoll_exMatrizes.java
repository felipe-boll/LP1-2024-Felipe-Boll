package ex.felipeBoll_matriz;

import java.util.Scanner;

public class FelipeBoll_exMatrizes {

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

    public static int[][] criatMatrizInt(int linhas, int colunas, int valorPreenchimento){
        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int  j = 0; j < colunas; j++){
                matriz[i][j] = valorPreenchimento;
            }
        }

        return matriz;
    }

    public static void imprimirMatrizInt(int[][] matriz){
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for(int i = 0; i < colunas; i++){
            System.out.printf("\t [ %d ]", i);
        }

        System.out.println();

        for (int i = 0; i < linhas; i++) {

            System.out.printf("[ %d ]", i);
            for (int j = 0; j < colunas; j++) {
                System.out.printf("\t%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void ex1(){
        int[][] matriz = {{ 1, 2, 3},
                          { 4, 5, 6},
                          { 7, 8, 9},
                          { 10, 11, 12},
                        };

    System.out.println(matriz[1][2]);
    matriz[1][2] = 12;
    System.out.println(matriz[1][2]);

    // retorna o tamanho da primeira dimensão, no caso n linhas
    int linhas = matriz.length;
    System.out.printf("linhas: %d", linhas);

    int colunas = matriz[0].length;
    System.out.printf("colunas: %d", colunas);

    }

    public static void ex2(){
        int[][] matriz = {{ 1, 2, 3},
                          { 4, 5, 6},
                          { 7, 8, 9},
                          { 10, 11, 12},
                        };
                        imprimirMatrizInt(matriz);
    }

    public static void ex3(){
        int[][] matriz = criatMatrizInt(2, 3, 99);
        imprimirMatrizInt(matriz);
    }

    public static void ex4(){
        int[][] matriz = lerMatrizInt(2, 2);
        imprimirMatrizInt(matriz);
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

    public static int[] obterLinha(int[][] matriz, int linha) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[] valorLinha = new int[colunas];


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                valorLinha[i] = matriz[linha][j];
            }
        }

        return valorLinha;
    }

    public static void ex5(){
        int[][] matriz = lerMatrizInt(4, 3);
        int somaMatrizInt = somaMatrizInt(matriz);
        System.out.println(somaMatrizInt);
    }

    public static void ex6(){
        int[][] matriz = lerMatrizInt(4, 3);
        int[] somaLinha = somarLinhasMatrizInt(matriz);
        imprimirArraysInt(somaLinha);
    }

    public static void ex7(){
        int[][] matriz = lerMatrizInt(4, 3);
        int[] somaColunas = somarColunasMatrizInt(matriz);
        imprimirArraysInt(somaColunas);
    }

    public static void ex8(){
        int[][] matriz = lerMatrizInt(4, 3);
        int linha = tecladoScanner.nextInt();
        int[] linhaDesejada = obterLinha(matriz, linha);
        imprimirArraysInt(linhaDesejada);
    }
    

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        ex8();
    }
}
