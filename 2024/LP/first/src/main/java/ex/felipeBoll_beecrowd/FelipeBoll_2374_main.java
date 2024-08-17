package ex.felipeBoll_beecrowd;

import java.util.Scanner;

public class FelipeBoll_2374_main {

  public static void pressaoN(int N) {

    if (N >= 0 && N <= 40) {
    } else
      ;
  }

  public static void pressaoDoPneu(int M) {

    if (M >= 0) {

    } else if (M <= 40) {
    }

  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    // N = pressao desejada
    int N = tecladoScanner.nextInt();
    // M = pressao do pneu
    int M = tecladoScanner.nextInt();
    int diferencaPressao = N - M;

    System.out.println(diferencaPressao);

    tecladoScanner.close();
  }
}
