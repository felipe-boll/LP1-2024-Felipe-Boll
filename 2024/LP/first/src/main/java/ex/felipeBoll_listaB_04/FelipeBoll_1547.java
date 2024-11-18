package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1547 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static int descobrirVencedor(int[] alunos, int numeroSorteado) {
    int vencedor = 0;
    int menorDiferenca = Integer.MAX_VALUE;
    int diferenca;

    for (int i = 0; i < alunos.length; i++) {
      diferenca = Math.abs(alunos[i] - numeroSorteado);

      if (diferenca == 0) {
        return i + 1;
      } else if (diferenca < menorDiferenca) {
        menorDiferenca = diferenca;
        vencedor = i + 1;
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
