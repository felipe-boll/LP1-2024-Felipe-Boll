package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1080 {

  public static void descobrirMaiorEPosicao() {
    Scanner tecladoScanner = new Scanner(System.in);

    int maiorValor = Integer.MIN_VALUE;
    int posicaoMaior = 0;

    for (int i = 1; i <= 100; i++) {
      int valor = tecladoScanner.nextInt();

      if (valor > maiorValor) {
        maiorValor = valor;
        posicaoMaior = i;
      }

    }

    System.out.printf("%d\n%d\n", maiorValor, posicaoMaior);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirMaiorEPosicao();
  }
}
