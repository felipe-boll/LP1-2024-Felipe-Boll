package ex.hipotenusa;

import ex.util.Helpers;

public class Hipotenusa {
  public static void main(String[] args) {
    // Entrada
    Helpers.imprimir("Informe um cateto");
    float cateto1 = Helpers.lerValorFloat();

    Helpers.imprimir("Informe outro cateto");
    float cateto2 = Helpers.lerValorFloat();

    // Processamento
    double somaCatetos = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
    double hipotenusa = Math.sqrt(somaCatetos);

    // Saida
    System.out.printf(" A hipotenusa é: %g", hipotenusa);
  }
}