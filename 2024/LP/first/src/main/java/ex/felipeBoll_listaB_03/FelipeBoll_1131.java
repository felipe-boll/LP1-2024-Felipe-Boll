package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1131 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void descobrirGrenais(int quantEmpates, int quantGrenais, int vitoriasInter, int vitoriasGremio,
            String vencedor) {

        while (true) {
            int golsInter = tecladoScanner.nextInt();
            int golsGremio = tecladoScanner.nextInt();

            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                quantEmpates++;
            }
            quantGrenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int sequencia = tecladoScanner.nextInt();

            if (sequencia == 2) {
                break;
            }

        }

        if (vitoriasGremio > vitoriasInter) {
            vencedor = "Gremio";
        }
        if (vitoriasInter > vitoriasGremio) {
            vencedor = "Inter";
        } else
            vencedor = "Ninguem";

        System.out.printf("%d grenais\n", quantGrenais);
        System.out.printf("Inter:%d\n", vitoriasInter);
        System.out.printf("Gremio:%d\n", vitoriasGremio);
        System.out.printf("Empates:%d\n", quantEmpates);
        System.out.printf("%s venceu mais\n", vencedor);

    }

    public static void main(String[] args) {
        
        int quantEmpates = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int quantGrenais = 0;
        String vencedor = " ";

        descobrirGrenais(quantEmpates, quantGrenais, vitoriasInter, vitoriasGremio, vencedor);
    }
}
