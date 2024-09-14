package ex.felipeBoll_listaB_01;

import java.util.Scanner;

public class FelipeBoll_2454_main {

  public static char obterResultado(int P, int R) {
    char resultado = ' ';

    if (P == 0) {
      resultado = 'C';
    } else if (R == 0) {
      resultado = 'B';
    } else
      resultado = 'A';

    return resultado;
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    int P = tecladoScanner.nextInt();
    int R = tecladoScanner.nextInt();
    char resultado = obterResultado(P, R);

    System.out.printf("%c\n", resultado);

    tecladoScanner.close();
  }
}
