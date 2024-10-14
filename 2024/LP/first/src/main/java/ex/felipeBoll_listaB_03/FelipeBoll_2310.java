package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_2310 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void main(String[] args) {

    int numJogadores = tecladoScanner.nextInt();

    for (int i = 0; i < numJogadores; i++) {

      tecladoScanner.next();

      int tentativaDeSaque = +tecladoScanner.nextInt();
      int tentativaDeBloqueio = +tecladoScanner.nextInt();
      int tentativaDeAtaques = +tecladoScanner.nextInt();

      int acertosDeSaque = +tecladoScanner.nextInt();
      int acertosDeBloqueio = +tecladoScanner.nextInt();
      int acertosDeAtaques = +tecladoScanner.nextInt();
    }

  }
}
