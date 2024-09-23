package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2388 {

  public static void descobrirDistanciaPercorrida() {
    Scanner tecladoScanner = new Scanner(System.in);

    int quantidadeDeRegistros = tecladoScanner.nextInt();
    int distanciaPercorrida = 0;

    for (int i = 0; i < quantidadeDeRegistros; i++) {
      int tempo = tecladoScanner.nextInt();
      int velocidade = tecladoScanner.nextInt();

      distanciaPercorrida += velocidade * tempo;
    }

    System.out.printf("%d\n", distanciaPercorrida);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirDistanciaPercorrida();
  }
}
