package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2434 {

  public static void descobrirSaldoDoVovo() {
    Scanner tecladoScanner = new Scanner(System.in);

    int numeroDeDias = tecladoScanner.nextInt();
    int saldo = tecladoScanner.nextInt();

    int menorSaldo = saldo;

    for (int i = 0; i < numeroDeDias; i++) {
      int movimentoDoDinheiro = tecladoScanner.nextInt();
      saldo += movimentoDoDinheiro;

      if (saldo < menorSaldo) {
        menorSaldo = saldo;
      }
    }

    System.out.printf("%d\n", menorSaldo);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirSaldoDoVovo();
  }
}
