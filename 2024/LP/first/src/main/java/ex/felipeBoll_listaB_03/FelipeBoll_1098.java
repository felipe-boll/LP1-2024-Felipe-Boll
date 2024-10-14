package ex.felipeBoll_listaB_03;

public class FelipeBoll_1098 {
  public static void main(String[] args) {
    for (double i = 0; i < 2.1; i += 0.2) {
      for (double j = i + 1; j <= i + 3; j++) {

        if (i > 1.9 && i < 2.1) {
          i = 2.0;
        }

        if (i == (int) i) {
          System.out.printf("I=%.0f J=%.0f\n", i, j);
        } else
          System.out.printf("I=%.1f J=%.1f\n", i, j);
      }
    }
  }
}
