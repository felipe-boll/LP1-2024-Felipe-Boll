import java.util.Scanner;

public class FelipeBoll_1094Experiencias {
    
    public static void descobirCobaiasUtilizadas(){
        Scanner tecladoScanner = new Scanner(System.in);

        int quantTest = tecladoScanner.nextInt();
        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        double percentualCoelhos = 0;
        double percentualRatos = 0;
        double percentualSapos = 0;

        for(int i = 0; i < quantTest; i++){
            int numeroDeCobaias = tecladoScanner.nextInt();
            char tipoCobaia = tecladoScanner.next().charAt(0);

            if (tipoCobaia == 'C') {
                totalCoelhos += numeroDeCobaias;
            } else
            if (tipoCobaia == 'R') {
                totalRatos += numeroDeCobaias;
            } else
            if (tipoCobaia == 'S') {
                totalSapos += numeroDeCobaias;
            }

        }

        totalCobaias = totalCoelhos + totalRatos + totalSapos;

        percentualCoelhos =  ((double)totalCoelhos / totalCobaias) * 100;
        percentualRatos =  ((double)totalRatos / totalCobaias) * 100;
        percentualSapos =  ((double)totalSapos / totalCobaias) * 100;

        System.out.printf("Total: %d cobaias\n", totalCobaias);
        System.out.printf("Total de coelhos: %d\n", totalCoelhos);
        System.out.printf("Total de ratos: %d\n", totalRatos);
        System.out.printf("Total de sapos: %d\n", totalSapos);
        System.out.printf("Percentual de coelhos: %.2f%%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f%%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f%%\n", percentualSapos);

        tecladoScanner.close();
    }
    
    
    
    public static void main(String[] args) {
        descobirCobaiasUtilizadas();
    }
}
