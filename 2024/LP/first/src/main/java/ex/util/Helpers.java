package ex.util;

import java.util.Scanner;

public class Helpers {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static float lerValorFloat() {
    return tecladoScanner.nextFloat();
  }

  public static int lerValorInteiro() {
    return tecladoScanner.nextInt();
  }

  public static String lerProximaString() {
    return tecladoScanner.nextLine();
  }

  public static void imprimir(String mensagem) {
    System.out.println();
    System.out.println("----------------------------------------------------------------------");
    System.out.println(mensagem);
    System.out.println("----------------------------------------------------------------------");
    System.out.println();
  }
}
