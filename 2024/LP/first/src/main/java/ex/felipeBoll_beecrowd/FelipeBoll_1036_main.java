package ex.felipeBoll_beecrowd;

import java.util.Scanner;

public class FelipeBoll_1036_main {
  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    double a = tecladoScanner.nextDouble();
    double b = tecladoScanner.nextDouble();
    double c = tecladoScanner.nextDouble();

    double delta = (Math.pow(b, 2) - 4 * a * c);

    if (delta < 0 || a == 0)
      System.out.println("Impossivel calcular");
    else {
      // (-b + Math.sqrt(delta)) / 2*a
      System.out.printf("R1 = %.5f\n", (-b + Math.sqrt(delta)) / (2 * a));
      System.out.printf("R2 = %.5f\n", (-b - Math.sqrt(delta)) / (2 * a));
    }
    tecladoScanner.close();
  }
}
