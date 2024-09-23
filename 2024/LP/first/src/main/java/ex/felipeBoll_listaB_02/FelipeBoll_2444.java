package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2444 {

  public static void volumeTV() {
    Scanner tecladoScanner = new Scanner(System.in);

    int volumeInicial = tecladoScanner.nextInt();
    int numTrocas = tecladoScanner.nextInt();

    int volumeAtual = volumeInicial;

    for (int i = 0; i < numTrocas; i++) {
      int modificacao = tecladoScanner.nextInt();
      volumeAtual += modificacao;

      if (volumeAtual < 0) {
        volumeAtual = 0;
      } else if (volumeAtual > 100) {
        volumeAtual = 100;
      }
    }

    System.out.println(volumeAtual);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    volumeTV();
  }
}
