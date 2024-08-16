package ex.lista_01;

import ex.util.Helpers;

public class numeral {

  public static String teste(int numero) {
    String valor = " ";

    if (numero > 0)
      valor = "Positivo";
    else if (numero < 0)
      valor = "Negativo";
    else
      valor = "Igual a zero";

    return valor;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe um numero");
    int numero = Helpers.lerValorInteiro();

    // Saida
    System.out.printf("O seu numero é %s", teste(numero));
  }
}
