package ex.TCA;

import java.util.Scanner;

public class ByteDoMilhao {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static String qualSeuNome() {
    System.out.println("Qual seu nome");
    String nome = tecladoScanner.nextLine();

    if (nome.equals("Odair")) {
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

  public static String[][] criarPerguntasEAlternativas() {
    String[][] perguntasEAlternativas = { { "Teste", "A", "B", "C", "D" } };

    return perguntasEAlternativas;
  }

  public static String[] criarAlternativasCorretas() {
    String[] alternativasCorretas = { "A" };

    return alternativasCorretas;
  }

  public static void imprimirPerguntaEAlternativas(String[][] perguntasEAlternativas) {
    int linhas = perguntasEAlternativas.length;
    int colunas = perguntasEAlternativas[0].length;

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.printf("%s\n%s\n%s\n%s\n%s\n", perguntasEAlternativas[i][j]);
      }
    }
  }

  public static void main(String[] args) {
    String nome = qualSeuNome();
    falaInicial(nome);
    String[][] perguntasEAlternativas = criarPerguntasEAlternativas();
    String[] alternativasCorretas = criarAlternativasCorretas();

    for (int i = 0; i < alternativasCorretas.length; i++) {
      imprimirPerguntaEAlternativas(perguntasEAlternativas[i][]);
    }
  }
}
