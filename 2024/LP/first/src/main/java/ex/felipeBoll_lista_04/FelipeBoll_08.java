package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_08 {

  public static void descobrirValoresImparesEPares(int N) {
    int par = 0;
    int impar = 0;

    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        par++;
      } else
        impar++;

    }
    System.out.printf("O numero de pares é: %d\nE o numero de impares é: %d\n", par, impar);
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe um numero");
    int N = tecladoScanner.nextInt();

    descobrirValoresImparesEPares(N);

    tecladoScanner.close();
  }
}
