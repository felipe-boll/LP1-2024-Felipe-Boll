package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2342 {

  public static void overflow() {
    Scanner tecladoScanner = new Scanner(System.in);

    long numMaximo = tecladoScanner.nextLong();

    long primeiroValor = tecladoScanner.nextLong();
    char operador = tecladoScanner.next().charAt(0);
    long segundoValor = tecladoScanner.nextLong();

    long resultado = 0;

    if (operador == '+') {
      resultado = primeiroValor + segundoValor;
    } else if (operador == '*') {
      resultado = primeiroValor * segundoValor;
    }

    if (resultado > numMaximo) {
      System.out.println("OVERFLOW");
    } else
      System.out.println("OK");

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    overflow();
  }
}
