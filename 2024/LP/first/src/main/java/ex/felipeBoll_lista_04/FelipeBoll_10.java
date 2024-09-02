package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_10 {

  public static void descobrirMultiplo(int valor) {

    if (valor % 7 == 0) {
      System.out.printf("%d é multiplo de 7\n", valor);
    } else
      System.out.printf("%d não é multiplo de 7\n", valor);

  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    while (true) {
      System.out.println("Informe um valor");
      int valor = tecladoScanner.nextInt();

      if (valor < 1 || valor > 1000) {
        break;
      } else
        descobrirMultiplo(valor);
      break;
    }
    tecladoScanner.close();
  }
}
