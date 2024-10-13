package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1546 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void descobrirResponsavelDoFeedback() {
    String responsavel = " ";
    int quantFeedbacks = tecladoScanner.nextInt();

    for (int j = 0; j < quantFeedbacks; j++) {
      int feedback = tecladoScanner.nextInt();

      if (feedback == 1) {
        responsavel = "Rolien";
      } else if (feedback == 2) {
        responsavel = "Naej";
      } else if (feedback == 3) {
        responsavel = "Elehcim";
      } else if (feedback == 4) {
        responsavel = "Odranoel";
      }

      System.out.printf("%s\n", responsavel);

    }
  }

  public static void main(String[] args) {
    int quantTestes = tecladoScanner.nextInt();

    for (int i = 0; i < quantTestes; i++) {
      descobrirResponsavelDoFeedback();
    }

  }
}
