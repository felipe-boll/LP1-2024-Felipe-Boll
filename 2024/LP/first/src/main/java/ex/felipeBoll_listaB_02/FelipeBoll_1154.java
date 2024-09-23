package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1154 {
    
    public static void descobrirMediaIdades(){
        Scanner tecladoScanner = new Scanner(System.in);

        int somaIdades = 0;
        int quantidadeDeIdades = 0;

        while (true) {
            int idade = tecladoScanner.nextInt();
        
            if (idade < 0) {
                break;
            }

            somaIdades += idade;
            quantidadeDeIdades++;
            
            

        }
        
            double mediaIdades = (float)somaIdades / quantidadeDeIdades;
            System.out.printf("%.2f\n", mediaIdades);

        tecladoScanner.close();

    }    
    
    public static void main(String[] args) {
        descobrirMediaIdades();
    }
}
