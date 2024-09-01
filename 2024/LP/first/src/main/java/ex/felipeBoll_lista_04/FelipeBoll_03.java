package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_03 {

  public static void descobrirIntervalo(int v1, int v2) {

    if (v1 < v2) {
      for (; v1 <= v2; v1++) {
        System.out.println(v1);
      }
    } else
      for (; v1 >= v2; v1--) {
        System.out.println(v1);
      }

  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe o primeiro valor");
    int v1 = tecladoScanner.nextInt();

    System.out.println("Informe o segundo valor");
    int v2 = tecladoScanner.nextInt();

    descobrirIntervalo(v1, v2);

    tecladoScanner.close();
  }
}
