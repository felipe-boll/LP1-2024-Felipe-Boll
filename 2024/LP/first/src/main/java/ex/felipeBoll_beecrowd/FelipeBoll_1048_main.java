package ex.felipeBoll_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class FelipeBoll_1048_main {

  public static int obterPercentual(double salario) {
    int percentual = 0;

    if (salario >= 0f && salario <= 400f) {
      percentual = 15;
    } else if (salario > 400f && salario <= 800f) {
      percentual = 12;
    } else if (salario > 800f && salario <= 1200f) {
      percentual = 10;
    } else if (salario > 1200f && salario <= 2000f) {
      percentual = 7;
    } else {
      percentual = 4;
    }

    return percentual;
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    tecladoScanner.useLocale(Locale.US);

    double salario = tecladoScanner.nextDouble();
    int percentual = obterPercentual(salario);
    double novoSalario = salario * (percentual / 100f) + salario;
    double reajuste = novoSalario - salario;

    System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", novoSalario, reajuste,
        percentual);

    tecladoScanner.close();
  }
}
