package ex.TCA;

import java.util.Scanner;

public class ByteDoMilhao {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static String qualSeuNome() {
    System.out.println("Qual seu nome");
    String nome = tecladoScanner.nextLine();

    if (nome.equals("Odair") || nome.equals("Oda")) {
      nome = "Mestre";
    }

    return nome;
  }

  public static void falaInicial(String nome) {
    if (nome.equals("Mestre")) {
      System.out.printf("Vejamos se não temos um mestre entre nós. Acho que este teste sera facil para o senhor");
    } else {
      System.out.printf("Então vamos testar suas habilidades %s", nome);
    }
  }

  public static String[] patentesNaEmpresa() {
    String[] patente = { "Estagiario" };

    return patente;
  }

  public static String[][] criarPerguntasEAlternativas() {
    String[][] perguntasEAlternativas = { { "Teste", "A", "B", "C", "D" },
        { "Teste", "A", "B", "C", "D" },
        { "Teste", "A", "B", "C", "D" },
        { "Teste", "A", "B", "C", "D" },
        { "Teste", "A", "B", "C", "D" } };

    return perguntasEAlternativas;
  }

  public static String[] criarAlternativasCorretas() {
    String[] alternativasCorretas = { "A" };

    return alternativasCorretas;
  }

  public static void imprimirPerguntaEAlternativas(String[][] perguntasEAlternativas, int numPerguntas) {
    int colunas = perguntasEAlternativas[0].length;

    for (int j = 0; j < colunas; j++) {
      System.out.printf("%s\n", perguntasEAlternativas[numPerguntas][j]);
    }

  }

  public static String perguntaDaAlternativa(String nome) {
    System.out.printf("Então %s, qual vai escolher? A, B, C ou D?\n", nome);
    String alternativaSelecionada = tecladoScanner.nextLine();

    return alternativaSelecionada;
  }

  public static void verificarSePerguntaCorreta(String alternativaSelecionada, String[] alternativasCorretas,
      int numPerguntas) {
    if (alternativasCorretas[numPerguntas].equals(alternativaSelecionada)) {

    }
  }

  public static void main(String[] args) {
    String nome = qualSeuNome();
    falaInicial(nome);
    String[][] perguntasEAlternativas = criarPerguntasEAlternativas();
    String[] alternativasCorretas = criarAlternativasCorretas();
    String[] patente = patentesNaEmpresa();

    while (true) {
      int numPerguntas = 0;

      if (numPerguntas == perguntasEAlternativas.length) {
        break;
      }

      imprimirPerguntaEAlternativas(perguntasEAlternativas, numPerguntas);

      String alternativaSelecionada = perguntaDaAlternativa(nome);

      numPerguntas++;
    }
  }
}
