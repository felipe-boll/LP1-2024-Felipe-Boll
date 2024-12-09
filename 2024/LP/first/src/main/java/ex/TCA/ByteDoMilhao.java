package ex.TCA;

import java.util.Scanner;

public class ByteDoMilhao {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static String qualSeuNome() {
    System.out.println("Qual seu nome");
    String nome = tecladoScanner.nextLine();

    if (nome.equals("Odair") || nome.equals("Oda")) {
      nome = "Mestre";
    } else if(nome.equals("Lo") || nome.equals("Thiago Lo")){
      nome = "Senhor Thiagolo";
    }

    return nome;
  }

  public static void falaInicial(String nome) {
    if (nome.equals("Mestre")) {
      System.out.printf("Vejamos se não temos um mestre entre nós. Acho que este teste sera facil para o senhor\n");
    } else if (nome.equals("Senhor Thiagolo")) {
      System.out.printf("Vejamos se não estamos com ele, com o magnifico, o grande, o incrivel, o SENHOR dos senhores, %s. Vamos ver se voce é capaz deste desafio\n", nome);
    }else{
      System.out.printf("Então vamos testar suas habilidades %s\n", nome);
    }
  }

  public static String[] patentesNaEmpresa() {
    String[] patente = { "Estagiario", "Alguma coisa" };

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
    String[] alternativasCorretas = {"A", "B", "C", "D", "A"};

    return alternativasCorretas;
  }

  public static void imprimirPerguntaEAlternativas(String[][] perguntasEAlternativas, int numPerguntas) {
    String[] perguntas = new String[perguntasEAlternativas.length];
    int colunas = perguntasEAlternativas[0].length;

    for (int j = 0; j < colunas; j++) {
      perguntas[numPerguntas] = perguntasEAlternativas[numPerguntas][j];
      System.out.println(perguntas[numPerguntas]);
    }

  }

  public static String perguntaDaAlternativa(String nome) {
    System.out.printf("Então %s, qual vai escolher? A, B, C ou D?\n", nome);
    String alternativaSelecionada = tecladoScanner.nextLine();

    return alternativaSelecionada;
  }

  public static void verificarSePerguntaCorreta(String alternativaSelecionada, String[] alternativasCorretas,
      int numPerguntas, String suaPatente, String patentes, String nome){

    if (alternativasCorretas[numPerguntas].equals(alternativaSelecionada)) {
      suaPatente = patentes[];
      System.out.printf("Parabens, voce realmente acertou %s. Agora eu vou te promover para a posicão de %s\n", nome, patente[(numPerguntas + 1)]);
    } else{
      System.out.printf("Que pena %s, mas não desanima, vamos para a proxima. Voce na patente %s\n", nome, suaPatente);
    }
  }

  public static void main(String[] args) {
    String nome = qualSeuNome();
    falaInicial(nome);
    String[][] perguntasEAlternativas = criarPerguntasEAlternativas();
    String[] alternativasCorretas = criarAlternativasCorretas();
    String[] patentes = patentesNaEmpresa();
    String suaPatente = patentes[0];
    
    int numPerguntas = 0;

    while (true) {
      if (numPerguntas == perguntasEAlternativas.length) {
        break;
      }

      imprimirPerguntaEAlternativas(perguntasEAlternativas, numPerguntas);

      String alternativaSelecionada = perguntaDaAlternativa(nome);
      verificarSePerguntaCorreta(alternativaSelecionada, alternativasCorretas, numPerguntas, suaPatente, nome);

      numPerguntas++;
    }
  }
}
