package ex.lista_01;

import java.util.Scanner;

public class CotacaoDolar {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static float lerValorFloat() {
    return tecladoScanner.nextFloat();
  }

  public static void imprimir(String mensagem) {
    System.out.println();
    System.out.println("----------------------------------------------------------------------");
    System.out.println(mensagem);
    System.out.println("----------------------------------------------------------------------");
    System.out.println();

  }

  public static float conversaoParaReais(float cotacaoDolar, float quantidadeDolar) {
    return cotacaoDolar * quantidadeDolar;
  }

  public static void main(String[] args) {
    // Entrada
    imprimir("Informe a cotação do dólar");
    float cotacaoDolar = lerValorFloat();

    imprimir("Informe quantos dólares você tem");
    float quantidadeDolar = lerValorFloat();

    // Processamento
    float quantidadeDeReais = conversaoParaReais(cotacaoDolar, quantidadeDolar);

    // Saida
    System.out.printf("Voce tem: %f reais", quantidadeDeReais);
    tecladoScanner.close();
  }

}
