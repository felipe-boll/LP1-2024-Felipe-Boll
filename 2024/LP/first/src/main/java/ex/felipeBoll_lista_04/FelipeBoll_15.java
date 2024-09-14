package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_15 {
  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    int quantidadeDeEleitores1 = 0;
    int quantidadeDeEleitores2 = 0;
    int quantidadeTotalDeVotosNecessarios = 305;
    int quantidadeDeVotosFeitos = 0;

    while (quantidadeDeVotosFeitos < quantidadeTotalDeVotosNecessarios) {
      System.out.println("Informe o candidato (1 ou 2)");
      int voto = tecladoScanner.nextInt();

      if (voto == 1) {
        quantidadeDeEleitores1++;
        quantidadeDeVotosFeitos++;
      } else if (voto == 2) {
        quantidadeDeEleitores2++;
        quantidadeDeVotosFeitos++;
      } else
        System.out.printf("O valor deve ser 1 ou 2. Informe novamente");
    }

    System.out.printf("Total de votos a favor do candidado 1: %d\n", quantidadeDeEleitores1);
    System.out.printf("Total de votos a favor do candidato 2: %d\n", quantidadeDeEleitores2);

    if (quantidadeDeEleitores1 > quantidadeDeEleitores2) {
      System.out.printf("O novo presidente do concelho estudantil é o candidato 1");
    } else if (quantidadeDeEleitores2 > quantidadeDeEleitores1) {
      System.out.printf("O novo presidente do concelho estudantil é o candidato 2");
    } else
      System.out.println("A eleição esta empatada");

    tecladoScanner.close();
  }
}
