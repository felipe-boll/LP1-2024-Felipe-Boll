package ex.felipeBoll_lista_04;

public class FelipeBoll_13 {
  public static void main(String[] args) {
    int primeiroTermo = 1;
    int segundoTermo = 1;
    int termoSeguinte;

    System.out.printf("%d, %d", primeiroTermo, segundoTermo);

    for (int i = 3; i <= 10; i++) {
      termoSeguinte = primeiroTermo + segundoTermo;
      System.out.printf(", %d", termoSeguinte);

      primeiroTermo = segundoTermo;
      segundoTermo = termoSeguinte;
    }
  }
}
