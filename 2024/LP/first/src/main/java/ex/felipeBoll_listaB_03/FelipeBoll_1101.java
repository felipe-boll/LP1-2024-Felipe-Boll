package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1101 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void calcularSoma(int maior, int menor, int soma) {
    for (int i = menor; i <= maior; i++) {
      System.out.print(i);
      soma += i;

      if (i < maior) {
        System.out.print(" ");
      }
    }
    System.out.printf(" Sum=%d\n", soma);
  }

  public static void main(String[] args) {
    while (true) {
      int m = tecladoScanner.nextInt();
      int n = tecladoScanner.nextInt();

      if (m <= 0 || n <= 0) {
        break;
      }

      int maior = Math.max(m, n);
      int menor = Math.min(m, n);

      int soma = 0;

      calcularSoma(maior, menor, soma);
    }
  }
}
