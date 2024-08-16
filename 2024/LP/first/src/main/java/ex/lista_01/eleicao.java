package ex.lista_01;

import ex.util.Helpers;

public class eleicao {

  public static String classeEleitoral(int idade) {
    String suaClasseEleitoral = " ";

    if (idade < 16)
      suaClasseEleitoral = "Não eleitor";
    else if (idade > 18 && idade < 65 || idade >= 16 && idade <= 18)
      suaClasseEleitoral = "Eleitor obrigatorio";
    else
      suaClasseEleitoral = "Eleitor facultativo";

    return suaClasseEleitoral;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe sua idade");
    int idade = Helpers.lerValorInteiro();

    // Processamento
    String suaClasseEleitoral = classeEleitoral(idade);

    // Saida
    System.out.printf("Sua classe eleitoral é: %s", suaClasseEleitoral);
  }
}
