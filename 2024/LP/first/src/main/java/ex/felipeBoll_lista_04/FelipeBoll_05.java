package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_05 {

  public static void descobrirIntervalo(int valor1, int valor2) {
    int soma = 0;

    for (int i = valor1; i == valor2; i++) {

    }

  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe o primeiro valor");
    int valor1 = tecladoScanner.nextInt();

    System.out.println("Informe o segundo valor");
    int valor2 = tecladoScanner.nextInt();

    descobrirIntervalo(valor1, valor2);

    tecladoScanner.close();
  }
}
