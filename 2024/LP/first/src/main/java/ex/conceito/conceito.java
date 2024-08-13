package ex.conceito;

import ex.util.Helpers;

public class conceito {

  public static Character convercaoParaConceito(int mediaFinal) {
    char conceito = ' ';

    if (mediaFinal >= 90)
      conceito = 'A';
    else if (mediaFinal >= 75 && mediaFinal < 90)
      conceito = 'B';
    else if (mediaFinal >= 60 && mediaFinal < 75)
      conceito = 'C';

    else if (mediaFinal >= 40 && mediaFinal < 60)
      conceito = 'D';
    else
      conceito = 'E';
    return conceito;
  }

  public static String verificador(char conceito) {
    String resultado = " ";

    if (conceito == 'A' || conceito == 'B' || conceito == 'C')
      resultado = "Aprovado";
    else
      resultado = "Reprovado";

    return resultado;
  }

  public static void main(String[] args) {

    // Entrada
    Helpers.imprimir("Informe o nome do aluno");
    String nome = Helpers.lerProximaString();

    Helpers.imprimir("Informe a primeira nota do aluno");
    int nota1 = Helpers.lerValorInteiro();

    Helpers.imprimir("Informe a segunda nota do aluno");
    int nota2 = Helpers.lerValorInteiro();

    Helpers.imprimir("Informe a terceira nota do aluno");
    int nota3 = Helpers.lerValorInteiro();

    // Processamento
    int mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
    char conceito = convercaoParaConceito(mediaFinal);
    String resultado = verificador(conceito);

    // Saida
    System.out.printf("%s seu conceito é %c e voce esta %s", nome, conceito, resultado);
  }
}
