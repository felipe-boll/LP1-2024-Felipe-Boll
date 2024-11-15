package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1174 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void pegarMenoresDe10(double[] array) {
    for (int i = 0; i < array.length; i++) {

      array[i] = tecladoScanner.nextDouble();

      if (array[i] <= 10) {
        System.out.printf("A[%d] = %.1f\n", i, array[i]);
      }
    }
  }

  public static void main(String[] args) {
    double[] array = new double[100];

    pegarMenoresDe10(array);

  }
}
