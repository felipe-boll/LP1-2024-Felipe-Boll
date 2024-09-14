package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_12 {
  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe um valor inteiro");
    int valor = tecladoScanner.nextInt();

    long fat = 1;

    for (int i = 1; i <= valor; i++) {
      fat *= i;
    }

    System.out.printf("O fatorial de %d é: %d", valor, fat);

    tecladoScanner.close();
  }
}
