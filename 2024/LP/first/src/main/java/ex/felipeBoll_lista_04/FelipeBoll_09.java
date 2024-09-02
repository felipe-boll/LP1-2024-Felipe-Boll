package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_09 {

  public static void descobrirQualIntervalo(int N) {

    // Intervalo entre 0 e 25
    int quantidadeIntervalo1 = 0;
    // Intervalo entre 26 e 50
    int quantidadeIntervalo2 = 0;
    // maior que 50
    int quantidadeIntervalo3 = 0;

    for (int i = N; i > 0; i--) {
      if (N >= 0 && N <= 25) {
        quantidadeIntervalo1++;
      } else if (N >= 26 && N <= 50) {
        quantidadeIntervalo1++;
        quantidadeIntervalo2++;
      } else
        quantidadeIntervalo3++;
    }
    System.out.printf(
        "A quantidade de numeros entre 0 e 25 é: %d\nA quantidade de numeros entre 26 e 50 é: %d\nA quantidade de numeros maior que 50 é: %d",
        quantidadeIntervalo1, quantidadeIntervalo2, quantidadeIntervalo3);
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    System.out.println("Informe um valor");
    int N = tecladoScanner.nextInt();

    descobrirQualIntervalo(N);

    tecladoScanner.close();
  }
}
