package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_2791 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void descobrirOndeEstaOFeijao(int[] copos) {
    for (int i = 0; i < copos.length; i++) {
      if (copos[i] == 1) {
        System.out.println(i + 1);
      }
    }
  }

  public static void main(String[] args) {
    int[] copos = new int[4];

    for (int i = 0; i < copos.length; i++) {
      copos[i] = tecladoScanner.nextInt();
    }

    descobrirOndeEstaOFeijao(copos);
  }
}
