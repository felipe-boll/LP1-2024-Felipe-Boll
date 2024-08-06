package ex.area_trapezio;

import ex.util.Helpers;

public class AreaTrapezio {

  public static void main(String[] args) {
    // Entrada
    Helpers.imprimir("Informe a base maior");
    float baseMaior = Helpers.lerValorFloat();

    Helpers.imprimir("Informe a base menor");
    float baseMenor = Helpers.lerValorFloat();

    Helpers.imprimir("Informe a altura");
    float altura = Helpers.lerValorFloat();

    // Processamento
    float area = ((baseMaior + baseMenor) * altura) / 2;

    // Saida
    System.out.printf(" A area desse trapezio é de: %f", area);
    Helpers.tecladoScanner.close();
  }

}
