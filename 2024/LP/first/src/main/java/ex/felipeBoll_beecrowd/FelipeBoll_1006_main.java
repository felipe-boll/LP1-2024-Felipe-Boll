package ex.felipeBoll_beecrowd;

import java.util.Scanner;

public class FelipeBoll_1006_main {
  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    double a = tecladoScanner.nextDouble();
    double b = tecladoScanner.nextDouble();
    double c = tecladoScanner.nextDouble();

    System.out.printf("MEDIA = %.1f\n", (a * 2 + b * 3 + c * 5) / 10);

    tecladoScanner.close();
  }
}
