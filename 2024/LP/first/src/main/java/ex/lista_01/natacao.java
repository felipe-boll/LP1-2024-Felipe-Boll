package ex.lista_01;

import ex.util.Helpers;

public class natacao {

  public static String divisaoDaNatacao(int idade) {
    String categoria = " ";

    if (idade >= 3 && idade <= 5)
      categoria = "Infantil A";
    else if (idade >= 6 && idade <= 9)
      categoria = "Infantil B";
    else if (idade >= 10 && idade <= 13)
      categoria = "Juvenil A";
    else if (idade >= 14 && idade <= 17)
      categoria = "Juvenil B";
    else
      categoria = "Senior";

    return categoria;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe sua idade");
    int idade = Helpers.lerValorInteiro();

    // Processamento
    String categoria = divisaoDaNatacao(idade);

    // Saida
    System.out.printf("Voce esta na categoria %s", categoria);
  }
}
