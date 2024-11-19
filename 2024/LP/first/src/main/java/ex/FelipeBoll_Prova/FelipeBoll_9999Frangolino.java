package ex.FelipeBoll_Prova;

import java.util.Scanner;

public class FelipeBoll_9999Frangolino {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void imprimirResultado(double media, int acimaDaMedia, double porcentagemAcima, int contLote) {
    System.out.printf("Lote %d\nMédia = %.2f\nFrangão = %d\nPorcentagem Acima = %.2f%%\n\n", contLote, media,
        acimaDaMedia, porcentagemAcima);
  }

  public static int descobrirFrangosAcimaMedia(double[] frangos, double media) {
    int acimaDaMedia = 0;

    for (int i = 0; i < frangos.length; i++) {
      if (frangos[i] > media) {
        acimaDaMedia++;
      }
    }

    return acimaDaMedia;
  }

  public static double descobrirMediaDoLOte(double[] frangos, int quantFrangos) {
    double media = 0;

    for (int i = 0; i < frangos.length; i++) {
      media += frangos[i];
    }

    media /= quantFrangos;

    return media;
  }

  public static void main(String[] args) {
    int contLote = 0;

    while (true) {
      // Entrada
      int quantFrangos = tecladoScanner.nextInt();

      // Processamento
      if (quantFrangos == 0) {
        break;
      }

      contLote++;
      double[] frangos = new double[quantFrangos];

      for (int i = 0; i < frangos.length; i++) {
        frangos[i] = tecladoScanner.nextDouble();
      }

      double media = descobrirMediaDoLOte(frangos, quantFrangos);
      int acimaDaMedia = descobrirFrangosAcimaMedia(frangos, media);
      double porcentagemAcima = (acimaDaMedia * 100) / quantFrangos;

      // Saida
      imprimirResultado(media, acimaDaMedia, porcentagemAcima, contLote);

    }
  }
}