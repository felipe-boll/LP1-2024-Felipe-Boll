package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_02 {

  public static void descobrirIntervalo() {
    Scanner tecladoScanner = new Scanner(System.in);

    int valorUsuario = tecladoScanner.nextInt();

    for (int i = 0; i <= valorUsuario; i++) {
      System.out.println(i);
    }
    tecladoScanner.close();
  }

  public static void main(String[] args) {

    descobrirIntervalo();

  }
}
