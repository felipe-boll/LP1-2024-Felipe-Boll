package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1547 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static int descobrirVencedor(int[] alunos, int numeroSorteado) {
    int vencedor = 0;

    for (int i = 0; i < alunos.length; i++) {

      if (alunos[i] == numeroSorteado) {
        vencedor = i + 1;
        break;
      }

    }

    return vencedor;
  }

  public static int[] preencherComNumerosEscolhidos(int[] alunos) {
    for (int i = 0; i < alunos.length; i++) {
      alunos[i] = tecladoScanner.nextInt();
    }

    return alunos;
  }

  public static void main(String[] args) {
    int quantTestes = tecladoScanner.nextInt();

    for (int i = 0; i < quantTestes; i++) {
      int quantParticipantes = tecladoScanner.nextInt();
      int numeroSorteado = tecladoScanner.nextInt();

      int[] alunos = new int[quantParticipantes];

      alunos = preencherComNumerosEscolhidos(alunos);

      System.out.println(descobrirVencedor(alunos, numeroSorteado));

    }

  }
}
