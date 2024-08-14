package ex.felipeBoll_beecrowd;

import java.util.Scanner;

public class FelipeBoll_1002_main {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static double lerValorDouble() {
    return tecladoScanner.nextDouble();
  }

  public static double calcularAreaCirculo(double raio) {
    double area = 0;
    double PI = 3.14159;

    area = PI * Math.pow(raio, 2);
    return area;
  }

  /*
   * public static void imprimirResultado(double area) {
   * System.out.printf("A area é de %.4f/n", area);
   * }
   */
  public static void main(String[] args) {
    double raio = lerValorDouble();
    double area = calcularAreaCirculo(raio);

    System.out.printf("A=%.4f\n", area);
  }
}
