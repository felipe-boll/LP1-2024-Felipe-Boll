import java.util.Scanner;

public class FelipeBoll_9999Eleicoes {

    public static void descobirResultadoEleicoes(){
        Scanner tecladoScanner = new Scanner(System.in);

        int totalVotosCandidato1 = 0;
        int totalVotosCandidato2 = 0;
        int totalVotosNulos = 0;

        while (true) {
            
            int voto = tecladoScanner.nextInt();
            
            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                    totalVotosCandidato1++;
                    break;
                case 2:
                    totalVotosCandidato2++;
                    break;
                case 3:
                    totalVotosNulos++;
                    break;
                default:
                    voto = tecladoScanner.nextInt();
            }
        }

        System.out.println("=================================================================");
        System.out.println();
        System.out.printf("Total de votos do candidato 1: %d\n",totalVotosCandidato1);
        System.out.printf("Total de votos do candidato 2: %d\n",totalVotosCandidato2);
        System.out.printf("Total de votos nulos: %d\n", totalVotosNulos);

        if (totalVotosCandidato1 > totalVotosCandidato2) {
            System.out.println("O vencedor das eleições é o candidato 1!!");
        } else
            if (totalVotosCandidato2 > totalVotosCandidato1) {
            System.out.println("O vencedor das eleições é o candidato 2!!");
            } else
            if (totalVotosNulos > totalVotosCandidato1 + totalVotosCandidato2) {
                System.out.println("As eleições foram anuladas!!");
            }
        
        System.out.println();
        System.out.println("=================================================================");    

        tecladoScanner.close();
    }

    public static void main(String[] args) {
        descobirResultadoEleicoes();
    }
}
