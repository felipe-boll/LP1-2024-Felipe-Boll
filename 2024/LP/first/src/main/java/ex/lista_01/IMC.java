package ex.lista_01;

import ex.util.Helpers;

import java.lang.Math;

public class IMC {

  public static String verificacaoDoImc(double imc) {
    String classificacao = " ";

    if (imc < 18.5)
      classificacao = " Abaixo do peso";
    else if (imc >= 18.6 && imc <= 24.9)
      classificacao = " Peso ideal";
    else if (imc >= 30 && imc <= 34.9)
      classificacao = " Obesidade grau 1";
    else if (imc >= 35 && imc <= 39.9)
      classificacao = " Obesidade grau 2 (severa)";
    else if (imc >= 40)
      classificacao = " Obesidade grau 3 (morbida)";

    return classificacao;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe seu peso");
    double peso = Helpers.lerValorFloat();

    Helpers.imprimir("Informe sua altura");
    double altura = Helpers.lerValorFloat();

    // Processamento
    double imc = peso / Math.pow(altura, 2);
    String classificacao = verificacaoDoImc(imc);

    // Saida
    System.out.printf("Voce esta %s", classificacao);
  }
}
