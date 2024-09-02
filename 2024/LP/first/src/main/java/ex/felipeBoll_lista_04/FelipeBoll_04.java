package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_04 {

  public static void paresDoIntervalo(int valor1, int valor2) {
    int pares = 0;

    for (int i = valor1; i <= valor2; i++) {
      if (i % 2 == 0) {
        pares++;
      }
    }
    System.out.printf("A quantidade de pares é: %d", pares);
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe um valor");
    int valor1 = tecladoScanner.nextInt();

    System.out.println("Informe outro valor");
    int valor2 = tecladoScanner.nextInt();

    paresDoIntervalo(valor1, valor2);

    tecladoScanner.close();
  }
}
