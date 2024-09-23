package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1585 {
    
    public static void descobrirTamanhoDasPipas(){
        Scanner tecladoScanner = new Scanner(System.in);

        int quantidadeDePipasQueSeraoConstruidas = tecladoScanner.nextInt();

        for(int i = 0; i < quantidadeDePipasQueSeraoConstruidas; i++){
            int bambuX = tecladoScanner.nextInt();
            int bambuY = tecladoScanner.nextInt();
            
            int tamanhoDaPipa = (bambuX * bambuY) / 2;

            System.out.printf("%d cm2\n", tamanhoDaPipa);

        }

        tecladoScanner.close();
    }
    
    
    
    public static void main(String[] args) {
        descobrirTamanhoDasPipas();
    }
}
