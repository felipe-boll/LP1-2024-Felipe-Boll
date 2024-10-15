package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_1091 {

  public static Scanner teladoScanner = new Scanner(System.in);

  public static void descobrirEmQualSetor(int cordenadaM, int cordenadaN, int k) {

    for (int i = 0; i < k; i++) {
      int cordenadaX = teladoScanner.nextInt();
      int cordenadaY = teladoScanner.nextInt();

      if (cordenadaX == cordenadaN || cordenadaY == cordenadaM) {
        System.out.println("divisa");
      } else if (cordenadaX > cordenadaN && cordenadaY > cordenadaM) {
        System.out.println("NE");
      } else if (cordenadaX > cordenadaN && cordenadaY < cordenadaM) {
        System.out.println("SE");
      } else if (cordenadaX < cordenadaN && cordenadaY > cordenadaM) {
        System.out.println("NO");
      } else
        System.out.println("SO");
    }
  }

  public static void main(String[] args) {
    while (true) {
      int k = teladoScanner.nextInt();

      if (k == 0) {
        break;
      }

      int cordenadaN = teladoScanner.nextInt();
      int cordenadaM = teladoScanner.nextInt();

      descobrirEmQualSetor(cordenadaM, cordenadaN, k);

    }
  }
}
