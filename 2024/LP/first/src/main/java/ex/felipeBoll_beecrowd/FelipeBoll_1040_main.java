package ex.felipeBoll_beecrowd;

import java.util.Scanner;

public class FelipeBoll_1040_main {

  public static String testeAprovacao(double media) {
    String resultado = " ";

    if (media >= 7.0) {
      resultado = "Aluno aprovado";
    } else if (media < 5.0) {
      resultado = "Aluno reprovado";
    }

    return resultado;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double nota1 = scanner.nextDouble();
    double nota2 = scanner.nextDouble();
    double nota3 = scanner.nextDouble();
    double nota4 = scanner.nextDouble();

    double media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4) / 4;

    System.out.printf("Media: %.1f", media);
    scanner.close();
  }
}
