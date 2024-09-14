package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_17 {
  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    int tempo = 0;

    System.out.println("Informe a massa em gramas do material radioativo");
    double massa = tecladoScanner.nextDouble();

    while (massa >= 0.05) {
      massa /= 2;
      tempo += 60;
    }

    System.out.printf("O tempo necessario para a massa ser menor que 0.05 é: %d segundos", tempo);

    tecladoScanner.close();
  }
}
