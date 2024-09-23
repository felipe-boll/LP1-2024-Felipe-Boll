package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2862 {

  // Peço perdão pelas referencias

  public static void eMaisDe8Mil() {
    Scanner kamehameha = new Scanner(System.in);

    // quantidadeDeMortesKuririn = quantidade de leituras que serão feitas
    int quantidadeDeMortesKuririn = kamehameha.nextInt();

    for (int i = 0; i < quantidadeDeMortesKuririn; i++) {
      int nivelDeEnergia = kamehameha.nextInt();

      if (nivelDeEnergia > 8000) {
        System.out.println("Mais de 8000!");
      } else
        System.out.println("Inseto!");
    }

    kamehameha.close();
  }

  public static void main(String[] args) {
    eMaisDe8Mil();
  }
}
