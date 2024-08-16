package ex.lista_01;

import ex.util.Helpers;

public class FelipeBoll_15_main {

  public static String testeAnoBissexto(int diasAno) {
    String ano = " ";

    if (diasAno % 400 == 0 || diasAno % 4 == 0 && diasAno % 100 != 0)
      ano = "é bissexto";
    else
      ano = "não é bissexto";

    return ano;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe os dias de um ano");
    int diasAno = Helpers.lerValorInteiro();

    // Processamento
    String bissexto = testeAnoBissexto(diasAno);

    // Saida
    System.out.printf("O ano %s", bissexto);
  }
}
