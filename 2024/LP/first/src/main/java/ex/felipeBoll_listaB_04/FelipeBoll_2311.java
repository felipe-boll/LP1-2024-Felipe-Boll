package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_2311 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static double[] preencherComNotas(double[] notasRecebidas) {
    for (int i = 0; i < notasRecebidas.length; i++) {
      notasRecebidas[i] = tecladoScanner.nextDouble();
    }

    return notasRecebidas;
  }

  public static double descobrirPontuacao(double[] notasRecebidas, double grauDeDif) {
    double maior = Integer.MIN_VALUE;
    double menor = Integer.MAX_VALUE;
    double notaFinal = 0;

    for (int i = 0; i < notasRecebidas.length; i++) {
      notaFinal += notasRecebidas[i];

      if (notasRecebidas[i] > maior) {
        maior = notasRecebidas[i];
      }

      if (notasRecebidas[i] < menor) {
        menor = notasRecebidas[i];
      }
    }

    notaFinal = (notaFinal - (menor + maior)) * grauDeDif;

    return notaFinal;
  }

  public static void main(String[] args) {
    int quantJogadoras = tecladoScanner.nextInt();

    for (int i = 0; i < quantJogadoras; i++) {
      String nome = tecladoScanner.next();
      double grauDeDif = tecladoScanner.nextDouble();
      double[] notasRecebidas = new double[7];

      notasRecebidas = preencherComNotas(notasRecebidas);

      double notaFinal = descobrirPontuacao(notasRecebidas, grauDeDif);

      System.out.printf("%s %.2f\n", nome, notaFinal);

    }
  }
}
