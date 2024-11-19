package ex.FelipeBoll_Prova;

import java.util.Scanner;

public class FelipeBoll_1789Lesmas {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static int descobrirNivelMaior(int[] velocidadeLesmas) {
    int maiorVelocidade = 0;
    int nivelDaMaior;

    for (int i = 0; i < velocidadeLesmas.length; i++) {
      if (velocidadeLesmas[i] > maiorVelocidade) {
        maiorVelocidade = velocidadeLesmas[i];
      }
    }

    if (maiorVelocidade >= 20) {
      nivelDaMaior = 3;
    } else if (maiorVelocidade >= 10) {
      nivelDaMaior = 2;
    } else {
      nivelDaMaior = 1;
    }

    return nivelDaMaior;
  }

  public static void main(String[] args) {
    while (tecladoScanner.hasNext()) {
      // Entrada
      int numLesmas = tecladoScanner.nextInt();
      int[] velocidadeLesmas = new int[numLesmas];

      // Processamento
      for (int i = 0; i < velocidadeLesmas.length; i++) {
        velocidadeLesmas[i] = tecladoScanner.nextInt();
      }

      int nivelDaMaior = descobrirNivelMaior(velocidadeLesmas);

      // Saida
      System.out.println(nivelDaMaior);
    }
  }
}
