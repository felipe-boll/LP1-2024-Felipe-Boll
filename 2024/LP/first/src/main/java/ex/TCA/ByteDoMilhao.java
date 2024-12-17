package ex.TCA;

import java.util.Scanner;

public class ByteDoMilhao {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void menu() {
    String mensagem = "O jogo funciona da seguinte maneira: Voce entrara no Reality Show do nosso apresentador Silício Santos, onde ele te perguntara coisas sobre informatica e voce devera responder conforme a alternativa correta, conforme voce acerta ira subir nas patentes da empresa Empresa, voce começa como um simples estagiario mas pode até se tornar o CEO, boa sorte!!\n\n";

    while (true) {
      System.out.printf("1 - Para jogar Byte Do Milhão.\n2 - Como o jogo funciona\n");
      int interacaoMenu = tecladoScanner.nextInt();

      if (interacaoMenu == 1) {
        System.out.println("Então vamos jogar");
        break;
      } else {
        System.out.print(mensagem);
      }
    }
  }

  public static String qualSeuNome() {
    System.out.println("Qual seu nome?");
    String nome = tecladoScanner.next().toLowerCase();

    if (nome.equals("odair") || nome.equals("oda")) {
      nome = "Mestre";
    } else if (nome.equals("lo") || nome.equals("thiago lo")) {
      nome = "Senhor Thiagolo";
    }

    return nome;
  }

  public static void falaInicial(String nome, String suaPatente) {
    if (nome.equals("Mestre")) {
      System.out.printf(
          "Vejamos se não temos um mestre entre nós. Acho que este teste sera facil para o senhor mas mesmo assim vamos te colocar na posição de %s\n",
          suaPatente);
    } else if (nome.equals("Senhor Thiagolo")) {
      System.out.printf(
          "Vejamos se não estamos com ele, com o magnifico, o grande, o incrivel, o SENHOR dos senhores, %s. Vamos ver se voce é capaz deste desafio, vamos ver como o senhor se sai começando como %s\n",
          nome, suaPatente);
    } else {
      System.out.printf("Então vamos testar suas habilidades %s, voce começara na empresa como %s\n", nome, suaPatente);
    }
  }

  public static String[] patentesNaEmpresa() {
    String[] patente = { "Estagiario", "Alguma coisa", "BBB" };

    return patente;
  }

  public static String promover(String[] patente, int posicao) {
    String cargo = patente[posicao];
    // System.out.println(cargo);
    return cargo;
  }

  public static void limparTela(){
    for(int i = 0; i < 40; i++){
      System.out.println();
    }
    System.out.println("\033\143");

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
    String[] alternativasCorretas = { "A", "B", "C", "D", "A" };

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
    String alternativaSelecionada = tecladoScanner.next();

    return alternativaSelecionada;
  }

  public static void verificarSePerguntaCorreta(String alternativaSelecionada, String[] alternativasCorretas,
      int numPerguntas, String suaPatente, String[] patentes, String nome, int posicao) {

    if (alternativasCorretas[numPerguntas].equals(alternativaSelecionada)) {
      posicao++;
      suaPatente = promover(patentes, posicao);
      System.out.printf(
          "Parabens, voce realmente acertou %s. Agora eu vou te promover para a posicão de %s. Vamos para a proxima pergunta!!\n",
          nome,
          suaPatente); 
    } else {
      System.out.printf(
          "Que pena %s, mas não desanima, vamos para a proxima. Voce esta na patente %s. Vamos para a proxima pergunta!!\n",
          nome,
          suaPatente);
    }
  }

  public static void main(String[] args) {
    menu();
    String[] patentes = patentesNaEmpresa();
    int posicao = 0;
    String suaPatente = promover(patentes, posicao);
    String nome = qualSeuNome();
    falaInicial(nome, suaPatente);
    String[][] perguntasEAlternativas = criarPerguntasEAlternativas();
    String[] alternativasCorretas = criarAlternativasCorretas();

    int numPerguntas = 0;

    while (true) {
      if (numPerguntas == perguntasEAlternativas.length) {
        break;
      }

      imprimirPerguntaEAlternativas(perguntasEAlternativas, numPerguntas);

      String alternativaSelecionada = perguntaDaAlternativa(nome);
      verificarSePerguntaCorreta(alternativaSelecionada, alternativasCorretas, numPerguntas, suaPatente, patentes, nome,
          posicao);

      numPerguntas++;

    }
  }
}
