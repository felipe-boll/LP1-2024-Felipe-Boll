import java.util.Scanner;

public class FelipeBoll_9991Equacao {
    
    public static void realizarEquacao(){
        Scanner tecladoScanner = new Scanner(System.in);

        int entradaInicial = tecladoScanner.nextInt();
        int entradaFinal = tecladoScanner.nextInt();

        double menorY = Integer.MAX_VALUE;
        double maiorY = Integer.MIN_VALUE;

        for(int i = entradaInicial; i <= entradaFinal; i++){

            double y = -(1/Math.pow(10, 7)) * Math.pow(i, 3) + (1/100) * Math.pow(i, 2) + (1/10) * i - 2000;

            if (y > maiorY) {
                maiorY = y;
            } else 
            if (y < menorY) {
                menorY = y;
            }

        }

        System.out.printf("%f\n%f\n", menorY, maiorY);


        tecladoScanner.close();
    }
    

    public static void main(String[] args) {
    realizarEquacao();
    }
}
