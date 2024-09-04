package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_11 {

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    int idadeMax = Integer.MIN_VALUE;
    int idadeMin = Integer.MAX_VALUE;
    int numeroPessoas = 0;
    int somaIdades = 0;

    while (true) {
      System.out.println("Informe a sua idade (0 para fechar)");
      int idade = tecladoScanner.nextInt();

      if (idade <= 0) {
        break;
      }

      numeroPessoas++;
      somaIdades += idade;

      if (idadeMax < idade) {
        idadeMax = idade;
      }
      if (idadeMin > idade) {
        idadeMin = idade;
      }

    }

    float mediaIdades = somaIdades / numeroPessoas;
    if (numeroPessoas > 0) {

      System.out.printf(
          "O numero de pessoas entrevistadas é: %d\nA idade media dos entrevistados é de: %.0f\nA maior idade é: %d\nE a menor idade é: %d",
          numeroPessoas, mediaIdades, idadeMax, idadeMin);
    }

    tecladoScanner.close();
  }
}
