package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_06 {

  public static void somaDosPares(int valor1, int valor2) {
    int i = valor1;
    int soma = 0;

    for (; i <= valor2; i++) {
      if (i % 2 == 0) {
        soma += i;
      }
    }

    System.out.printf("A soma dos pares é de: %d", soma);
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe o primeiro valor");
    int valor1 = tecladoScanner.nextInt();

    System.out.println("Informe o segundo valor");
    int valor2 = tecladoScanner.nextInt();

    somaDosPares(valor1, valor2);

    tecladoScanner.close();
  }
}
