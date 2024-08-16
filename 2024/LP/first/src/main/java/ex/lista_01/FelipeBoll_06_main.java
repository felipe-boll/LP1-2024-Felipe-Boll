package ex.lista_01;

import ex.util.Helpers;

public class FelipeBoll_06_main {

  public static String teste(float numero) {
    String valor = " ";

    if (numero % 2 == 0)
      valor = "Par";
    else
      valor = "Impar";

    return valor;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe um numero");
    float numero = Helpers.lerValorFloat();

    // Saida
    System.out.printf("O seu numero é %s", teste(numero));
  }
}
