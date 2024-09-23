package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1170 {
    
    public static void descobrirDuracaoDaComidaDosBlobs(){
        Scanner tecladoScanner = new Scanner(System.in);

        // quantidade de dias que a comida vai durar
        int diasDaDuracao = 0;

        int quantidadeTestes = tecladoScanner.nextInt();

        for(int i = 1; i <= quantidadeTestes; i++){

            double quantidadeDeComidaDisponivel = tecladoScanner.nextDouble();

            while (true) {
                if (quantidadeDeComidaDisponivel == 0) {
                    System.out.printf("%d dias\n", diasDaDuracao);
                    break;
                }

                diasDaDuracao++;
                quantidadeDeComidaDisponivel /= (float) 2;

            }

        }

        tecladoScanner.close();
    }
    
    
    public static void main(String[] args) {
        descobrirDuracaoDaComidaDosBlobs();
    }
}
