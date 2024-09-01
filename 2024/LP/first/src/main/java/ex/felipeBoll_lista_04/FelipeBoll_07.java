package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_07 {

  public static void descobrirValoresPositivosENegativos(int N) {
    int positivos = 0;
    int negativos = 0;

    for (int i = 0; i < N; i++) {
      if (i < 0) {
        negativos++;
      } else
        positivos++;
    }
    System.out.printf("O numero de positivos é de: %d\nE o de negativos é de: %d", positivos, negativos);
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe um numero");
    int N = tecladoScanner.nextInt();

    descobrirValoresPositivosENegativos(N);

    tecladoScanner.close();
  }
}
