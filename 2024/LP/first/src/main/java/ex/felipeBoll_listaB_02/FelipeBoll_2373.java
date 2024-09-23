package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2373 {
    
    public static void descobrirCoposQuebrados(){
        Scanner tecladoScanner = new Scanner(System.in);

        int quantidadeDeBandejas = tecladoScanner.nextInt();
        int quantidadeDeCoposQuebrados = 0;

        for(int i = 0; i < quantidadeDeBandejas; i++){
            int quantidadeDeLatas = tecladoScanner.nextInt();
            int quantidadeDeCopos = tecladoScanner.nextInt();

            if (quantidadeDeCopos < quantidadeDeLatas) {
                quantidadeDeCoposQuebrados += quantidadeDeCopos;
            }

        }

        System.out.println(quantidadeDeCoposQuebrados);

        tecladoScanner.close();
    }
    
    
    public static void main(String[] args) {
        descobrirCoposQuebrados();
    }
}
