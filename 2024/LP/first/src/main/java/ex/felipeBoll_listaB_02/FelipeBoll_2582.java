package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_2582 {

  public static void desbobrirQualMusicaTocar() {
    Scanner tecladoScanner = new Scanner(System.in);

    int quantTest = tecladoScanner.nextInt();

    for (int i = 0; i < quantTest; i++) {
      int primeiraEnt = tecladoScanner.nextInt();
      int segundaEnt = tecladoScanner.nextInt();
      String musica = " ";

      int soma = primeiraEnt + segundaEnt;

      switch (soma) {
        case 0:
          musica = "PROXYCITY";
          break;
        case 1:
          musica = "P.Y.N.G.";
          break;
        case 2:
          musica = "DNSUEY!";
          break;
        case 3:
          musica = "SERVERS";
          break;
        case 4:
          musica = "HOST!";
          break;
        case 5:
          musica = "CRIPTONIZE";
          break;
        case 6:
          musica = "OFFLINE DAY";
          break;
        case 7:
          musica = "SALT";
          break;
        case 8:
          musica = "ANSWER!";
          break;
        case 9:
          musica = "RAR?";
          break;
        case 10:
          musica = "WIFI ANTENNAS";
          break;

      }

      System.out.println(musica);

    }
    tecladoScanner.close();
  }

  public static void main(String[] args) {
    desbobrirQualMusicaTocar();
  }
}
