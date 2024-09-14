package ex.felipeBoll_listaB_01;

import java.util.Scanner;

public class FelipeBoll_1011_main {
  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    double raio = tecladoScanner.nextDouble();

    System.out.printf("VOLUME = %.3f\n", (4.0 / 3) * 3.14159 * Math.pow(raio, 3));

    tecladoScanner.close();
  }
}
