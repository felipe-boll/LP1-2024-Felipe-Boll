package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1134 {

  public static void descobrirTipoCombustivel() {
    Scanner tecladoScanner = new Scanner(System.in);

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    while (true) {

      int combustivel = tecladoScanner.nextInt();

      if (combustivel == 4) {
        break;
      }

      if (combustivel == 1) {
        alcool++;
      } else if (combustivel == 2) {
        gasolina++;
      } else if (combustivel == 3) {
        diesel++;
      } else {

      }
    }

    System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);

    tecladoScanner.close();

  }

  public static void main(String[] args) {
    descobrirTipoCombustivel();
  }

}