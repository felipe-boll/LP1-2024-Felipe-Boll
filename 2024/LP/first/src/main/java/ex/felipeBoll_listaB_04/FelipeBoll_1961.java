package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1961 {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int[] lerVetorInteiro(int[] alturaCanos){
        for(int i = 0; i < alturaCanos.length; i++){
            alturaCanos[i] = tecladoScanner.nextInt();
        }
        return alturaCanos;
    }
    
    public static String descobrirSeSapoConseguePular(int[] alturaCanos, int alturaPulo){

        for(int i = 1; i < alturaCanos.length; i++){
            int diferenca = alturaCanos[i] - alturaCanos[i - 1];
            
            if (Math.abs(diferenca) > alturaPulo) {
                return "GAME OVER";
            }
        }
        return "YOU WIN";
    }
    
    public static void main(String[] args) {
        int alturaPulo = tecladoScanner.nextInt();
        int quantCanos = tecladoScanner.nextInt();

        int[] alturaCanos = new int[quantCanos];
        alturaCanos = lerVetorInteiro(alturaCanos);

        String mensagemFinal = descobrirSeSapoConseguePular(alturaCanos, alturaPulo);
        System.out.println(mensagemFinal);

    }
}
