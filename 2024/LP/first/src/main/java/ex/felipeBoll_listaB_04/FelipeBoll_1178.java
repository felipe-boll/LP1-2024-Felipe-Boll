package ex.felipeBoll_listaB_04;

public class FelipeBoll_1178 {

  public static java.util.Scanner tecladoScanner = new java.util.Scanner(System.in);

  public static void imprimirArraysInt(double[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("N[%d] = %.4f\n", i, array[i]);
    }
  }

  public static double[] dividirVetor(double[] vetor, double valor) {
    for (int i = 0; i < vetor.length; i++, valor /= 2) {
      vetor[i] = valor;
    }

    return vetor;
  }

  public static void main(String[] args) {
    double valor = tecladoScanner.nextDouble();
    double[] vetor = new double[100];

    imprimirArraysInt(dividirVetor(vetor, valor));
  }
}
