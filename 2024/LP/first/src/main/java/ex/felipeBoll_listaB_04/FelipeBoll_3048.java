package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_3048 {

  public static int descobrirMaximoDeNumerosSeguidos(int[] sequencia) {
    int resultado = 1;
    int ultimoResultadoMarcado = sequencia[0];

    for (int i = 0; i < sequencia.length; i++) {
      if (sequencia[i] != ultimoResultadoMarcado) {
        ultimoResultadoMarcado = sequencia[i];
        resultado++;
      }
    }

    return resultado;
  }

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void main(String[] args) {
    int tamanhoDaSequencia = tecladoScanner.nextInt();
    int[] sequencia = new int[tamanhoDaSequencia];

    for (int i = 0; i < sequencia.length; i++) {
      sequencia[i] = tecladoScanner.nextInt();
    }

    int resultado = descobrirMaximoDeNumerosSeguidos(sequencia);

    System.out.println(resultado);

  }
}
