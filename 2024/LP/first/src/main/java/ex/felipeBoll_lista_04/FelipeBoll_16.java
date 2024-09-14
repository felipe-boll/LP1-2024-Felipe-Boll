package ex.felipeBoll_lista_04;

import java.math.BigInteger;

public class FelipeBoll_16 {
  public static void main(String[] args) {

    int numeroDeCasas = 64;
    BigInteger quantidadeTotalDeGraos = BigInteger.ZERO;
    BigInteger graosNaCasaAtual = BigInteger.ONE;

    for (int i = 1; i <= numeroDeCasas; i++) {
      System.out.printf("Na casa %d tem: %d de grãos\n", i, graosNaCasaAtual);

      quantidadeTotalDeGraos = quantidadeTotalDeGraos.add(graosNaCasaAtual);

      graosNaCasaAtual = graosNaCasaAtual.multiply(BigInteger.TWO);
    }

    System.out.printf("Quantidade total de grãos é de: %s", quantidadeTotalDeGraos);

  }
}
