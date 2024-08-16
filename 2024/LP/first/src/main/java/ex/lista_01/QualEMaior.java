package ex.lista_01;

import ex.util.Helpers;

public class QualEMaior {

  public static Float testeDoMaior(float numero1, float numero2, float numero3) {
    float maiorNumero = 0;

    if (numero1 > numero2 && numero1 > numero3)
      maiorNumero = numero1;
    else if (numero2 > numero3)
      maiorNumero = numero2;
    else
      maiorNumero = numero3;

    return maiorNumero;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe um numero");
    float numero1 = Helpers.lerValorFloat();

    Helpers.imprimir("Informe outro numero");
    float numero2 = Helpers.lerValorFloat();

    Helpers.imprimir("Informe mais um numero");
    float numero3 = Helpers.lerValorFloat();

    // Processamento
    float maiorNumero = testeDoMaior(numero1, numero2, numero3);

    // Saida
    System.out.printf("O maior numero é: %f", maiorNumero);
  }
}
