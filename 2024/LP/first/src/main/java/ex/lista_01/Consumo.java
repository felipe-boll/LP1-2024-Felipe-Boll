package ex.consumo;

import java.util.Scanner;

public class Consumo {

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

  public static float calculoDeConsumo(float quilometro, float gasolina) {
    return quilometro / gasolina;
  }

  public static void main(String[] args) {
    // Entrada
    imprimir(" Informe a distancia percorrida em quilometros");
    float quilometro = lerValorFloat();

    imprimir(" Informe a gasolina gasta em litros");
    float gasolina = lerValorFloat();

    // Processamento
    float consumo = calculoDeConsumo(quilometro, gasolina);

    // Saida
    System.out.printf(" O consumo foi de %f litro por quilometro", consumo);
    tecladoScanner.close();
  }
}