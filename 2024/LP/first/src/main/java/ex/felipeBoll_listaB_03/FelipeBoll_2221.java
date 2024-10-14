package ex.felipeBoll_listaB_03;

import java.util.Scanner;

public class FelipeBoll_2221 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void descobrirGolpeVitorioso(int valorDoGolpe_D, int valorDoGolpe_G) {

    String vencedor = " ";

    if (valorDoGolpe_D > valorDoGolpe_G) {
      vencedor = "Dabriel";
    } else if (valorDoGolpe_G > valorDoGolpe_D) {
      vencedor = "Guarte";
    } else
      vencedor = "Empate";

    System.out.println(vencedor);
  }

  public static void descobrirValorDoGolpe() {

    int valorBonus = tecladoScanner.nextInt();

    // inf. do pokemon de Dabriel
    int ataqueP_D = tecladoScanner.nextInt();
    int defesaP_D = tecladoScanner.nextInt();
    int levelT_D = tecladoScanner.nextInt();

    // inf. do pokemon de Guarte
    int ataqueP_G = tecladoScanner.nextInt();
    int defesaP_G = tecladoScanner.nextInt();
    int levelT_G = tecladoScanner.nextInt();

    int valorDoGolpe_D = (ataqueP_D + defesaP_D) / 2;
    if (levelT_D % 2 == 0) {
      valorDoGolpe_D += valorBonus;
    }

    int valorDoGolpe_G = (ataqueP_G + defesaP_G) / 2;
    if (levelT_G % 2 == 0) {
      valorDoGolpe_G += valorBonus;
    }

    descobrirGolpeVitorioso(valorDoGolpe_D, valorDoGolpe_G);
  }

  public static void main(String[] args) {
    int instancia = tecladoScanner.nextInt();

    for (int i = 0; i < instancia; i++) {
      descobrirValorDoGolpe();
    }
  }
}
