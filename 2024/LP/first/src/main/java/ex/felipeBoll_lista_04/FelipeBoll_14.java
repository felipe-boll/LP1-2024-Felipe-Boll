package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_14 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static char lerNivelEnsino() {

    char nivel;

    while (true) {
      System.out.println("Informe seu nivel de ensino (T ou S)");
      nivel = tecladoScanner.next().charAt(0);

      if (nivel == 'T' || nivel == 'S') {
        break;
      }
      System.out.println("A resposta deve ser T ou S");
    }

    return nivel;

  }

  public static void main(String[] args) {

    int quantidadeEstudantesSup = 0;
    int quantidadeEstudantesTec = 0;
    int quantidadeEstudantesIntervalo18_35 = 0;

    while (true) {
      System.out.println("Informe sua idade (0 para fechar)");
      int idade = tecladoScanner.nextInt();

      if (idade == 0) {
        break;
      }

      char tipoEnsino = lerNivelEnsino();

      if (tipoEnsino == 'T') {
        quantidadeEstudantesTec++;
      } else {
        quantidadeEstudantesSup++;
      }

      if (idade >= 18 && idade <= 35) {
        quantidadeEstudantesIntervalo18_35++;
      }
    }

    int totalDeEstudantesEntrevistados = quantidadeEstudantesSup + quantidadeEstudantesTec;
    float porcentagemTec = (((float) quantidadeEstudantesTec) / totalDeEstudantesEntrevistados) * 100;
    float porcentagemSup = (((float) quantidadeEstudantesSup) / totalDeEstudantesEntrevistados) * 100;

    System.out.printf(
        "Quantidade de estudantes do tecnico: %d\nQuantida de estudantes do superior: %d\nQuantidade de estudantes no intervalo: %d\n",
        quantidadeEstudantesTec, quantidadeEstudantesSup, quantidadeEstudantesIntervalo18_35);
    System.out.printf(
        "A porcentagem de alunos do curso tecnico é: %.1f%%\nA porcentagem de alunos do curso superior é: %.1f%%\n",
        porcentagemTec, porcentagemSup);
  }
}
