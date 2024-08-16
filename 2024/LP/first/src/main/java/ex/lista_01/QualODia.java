package ex.lista_01;

import ex.util.Helpers;

public class QualODia {

  public static String obterDiasDaSemana(int dia) {
    String diaDaSemana = " ";

    switch (dia) {
      case 0:
        diaDaSemana = "Domingo";
        break;
      case 1:
        diaDaSemana = "Segunda-Feira";
        break;
      case 2:
        diaDaSemana = "Terça-Feira";
        break;
      case 3:
        diaDaSemana = "Quarta-Feira";
        break;
      case 4:
        diaDaSemana = "Quinta-Feira";
        break;
      case 5:
        diaDaSemana = "Sexta-Feira";
        break;
      case 6:
        diaDaSemana = "Sabado";
        break;
      default:
        diaDaSemana = "Invalido";
        break;

    }
    return diaDaSemana;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe um dia");
    int dia = Helpers.lerValorInteiro();

    // Processamento
    String diaDaSemana = obterDiasDaSemana(dia);

    // Saida
    System.out.printf("O dia da semanda é: %s", diaDaSemana);
  }
}
