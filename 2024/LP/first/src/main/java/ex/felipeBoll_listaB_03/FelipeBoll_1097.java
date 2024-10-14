package ex.felipeBoll_listaB_03;

public class FelipeBoll_1097 {
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i += 2) {
      for (int j = i + 6; j >= i + 4; j--) {
        System.out.printf("I=%d J=%d\n", i, j);
      }
    }
  }
}
