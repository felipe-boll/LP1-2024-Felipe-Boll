package ex.aposentadoria;

import ex.util.Helpers;

public class aposentadoria {

  public static String testeAposentadoria(int idade, int anosDeTrabalho) {
    String aposentadoria = " ";

    if (idade >= 65 || anosDeTrabalho >= 30 || idade >= 60 && anosDeTrabalho >= 25)
      aposentadoria = " pode se aposentar";
    else
      aposentadoria = " não pode se aposentar";

    return aposentadoria;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe sua idade");
    int idade = Helpers.lerValorInteiro();

    Helpers.imprimir("Informe quantos anos voce trabalhou");
    int anosDeTrabalho = Helpers.lerValorInteiro();

    // Processamento
    String aposentadoria = testeAposentadoria(idade, anosDeTrabalho);

    // Saida
    System.out.printf("Voce %s", aposentadoria);
  }
}
