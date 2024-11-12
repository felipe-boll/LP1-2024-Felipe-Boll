package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1796 {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static String opniaoGeralDaPopulacao(int[] opnioes){
        if (opnioes[0] > opnioes[1]) {
            return "Y";
        } else {
            return "N";
        }
        
    }

    public static int[] descobrirOpinioes(int[] opnioesParticipantes){
         int[] opnioes = new int[2];
         //opniões positivas
         opnioes[0] = 0;
         //opniões negativas;
         opnioes[1] = 0; 

        for(int i = 0; i < opnioesParticipantes.length; i++){
            int opniaoParticipante = tecladoScanner.nextInt();

            if (opniaoParticipante == 0) {
                opnioes[0]++;
            } else {
                opnioes[1]++;
            }

        }

        return opnioes;
    }
    
    
    public static void main(String[] args) {
        int Quantparticipantes = tecladoScanner.nextInt();
        int[] opnioesParticipantes = new int[Quantparticipantes];

        int[] opnioes = descobrirOpinioes(opnioesParticipantes);

        System.out.println(opniaoGeralDaPopulacao(opnioes));

        }
}
