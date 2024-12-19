package ex.TCA;

import java.util.Scanner;

public class ByteDoMilhao {

  public static Scanner tecladoScanner = new Scanner(System.in);

  // Cria a matriz que armazena o ASCII do nome do jogo
  public static String[][] byteDoMilhao() {
    String[][] byteDoMilhao = {
        { ":::::::::  :::   ::: ::::::::::: ::::::::::  :::::::::   ::::::::   ::::    ::::  ::::::::::: :::        :::    :::     :::      ::::::::  " },
        { ":+:    :+: :+:   :+:     :+:     :+:         :+:    :+: :+:    :+:  +:+:+: :+:+:+     :+:     :+:        :+:    :+:   :+: :+:   :+:    :+: " },
        { "+:+    +:+  +:+ +:+      +:+     +:+         +:+    +:+ +:+    +:+  +:+ +:+:+ +:+     +:+     +:+        +:+    +:+  +:+   +:+  +:+    +:+ " },
        { "+#++:++#+    +#++:       +#+     +#++:++#    +#+    +:+ +#+    +:+  +#+  +:+  +#+     +#+     +#+        +#++:++#++ +#++:++#++: +#+    +:+ " },
        { "+#+    +#+    +#+        +#+     +#+         +#+    +#+ +#+    +#+  +#+       +#+     +#+     +#+        +#+    +#+ +#+     +#+ +#+    +#+ " },
        { "#+#    #+#    #+#        #+#     #+#         #+#    #+# #+#    #+#  #+#       #+#     #+#     #+#        #+#    #+# #+#     #+# #+#    #+# " },
        { "#########     ###        ###     ##########  #########   ########   ###       ### ########### ########## ###    ### ###     ###  ########   " }
    };

    return byteDoMilhao;
  };

  // Cria a matriz que armazena o ASCII da opção 1, que serve para iniciar o jogo
  public static String[][] paraJogar() {
    String[][] paraJogar = {
        { "  :::                   :::::::::     :::     :::::::::      :::      ::::::::::: ::::::::   ::::::::      :::     :::::::::   :::::::::  :::   ::: ::::::::::: ::::::::::  :::::::::   ::::::::   ::::    ::::  ::::::::::: :::        :::    :::     :::      ::::::::  " },
        { ":+:+:                   :+:    :+:  :+: :+:   :+:    :+:   :+: :+:        :+:    :+:    :+: :+:    :+:   :+: :+:   :+:    :+:  :+:    :+: :+:   :+:     :+:     :+:         :+:    :+: :+:    :+:  +:+:+: :+:+:+     :+:     :+:        :+:    :+:   :+: :+:   :+:    :+: " },
        { "  +:+                   +:+    +:+ +:+   +:+  +:+    +:+  +:+   +:+       +:+    +:+    +:+ +:+         +:+   +:+  +:+    +:+  +:+    +:+  +:+ +:+      +:+     +:+         +:+    +:+ +:+    +:+  +:+ +:+:+ +:+     +:+     +:+        +:+    +:+  +:+   +:+  +:+    +:+ " },
        { "  +#+    +#++:++#++:++  +#++:++#+ +#++:++#++: +#++:++#:  +#++:++#++:      +#+    +#+    +:+ :#:        +#++:++#++: +#++:++#:   +#++:++#+    +#++:       +#+     +#++:++#    +#+    +:+ +#+    +:+  +#+  +:+  +#+     +#+     +#+        +#++:++#++ +#++:++#++: +#+    +:+ " },
        { "  +#+                   +#+       +#+     +#+ +#+    +#+ +#+     +#+      +#+    +#+    +#+ +#+   +#+# +#+     +#+ +#+    +#+  +#+    +#+    +#+        +#+     +#+         +#+    +#+ +#+    +#+  +#+       +#+     +#+     +#+        +#+    +#+ +#+     +#+ +#+    +#+ " },
        { "  #+#                   #+#       #+#     #+# #+#    #+# #+#     #+#  #+# #+#    #+#    #+# #+#    #+# #+#     #+# #+#    #+#  #+#    #+#    #+#        #+#     #+#         #+#    #+# #+#    #+#  #+#       #+#     #+#     #+#        #+#    #+# #+#     #+# #+#    #+# " },
        { "#######                 ###       ###     ### ###    ### ###     ###   #####      ########   ########  ###     ### ###    ###  #########     ###        ###     ##########  #########   ########   ###       ### ########### ########## ###    ### ###     ###  ########  " },
    };

    return paraJogar;
  }

  // Cria a matriz que armazena o ASCII da opção 2, que serve para explicar como o
  // jogo funciona
  public static String[][] comoFuncionda() {
    String[][] comoFunciona = {
        { " ::::::::                   ::::::::   ::::::::  ::::    ::::   ::::::::   :::::::::: :::    ::: ::::    :::  :::::::: ::::::::::: ::::::::  ::::    :::     :::       ::::::::   :::::::::  :::   ::: ::::::::::: ::::::::::  :::::::::   ::::::::   ::::    ::::  ::::::::::: :::        :::    :::     :::      ::::::::  " },
        { ":+:    :+:                 :+:    :+: :+:    :+: +:+:+: :+:+:+ :+:    :+:  :+:        :+:    :+: :+:+:   :+: :+:    :+:    :+:    :+:    :+: :+:+:   :+:   :+: :+:    :+:    :+:  :+:    :+: :+:   :+:     :+:     :+:         :+:    :+: :+:    :+:  +:+:+: :+:+:+     :+:     :+:        :+:    :+:   :+: :+:   :+:    :+: " },
        { "      +:+                  +:+        +:+    +:+ +:+ +:+:+ +:+ +:+    +:+  +:+        +:+    +:+ :+:+:+  +:+ +:+           +:+    +:+    +:+ :+:+:+  +:+  +:+   +:+   +:+    +:+  +:+    +:+  +:+ +:+      +:+     +:+         +:+    +:+ +:+    +:+  +:+ +:+:+ +:+     +:+     +:+        +:+    +:+  +:+   +:+  +:+    +:+ " },
        { "    +#+     +#++:++#++:++  +#+        +#+    +:+ +#+  +:+  +#+ +#+    +:+  :#::+::#   +#+    +:+ +#+ +:+ +#+ +#+           +#+    +#+    +:+ +#+ +:+ +#+ +#++:++#++:  +#+    +:+  +#++:++#+    +#++:       +#+     +#++:++#    +#+    +:+ +#+    +:+  +#+  +:+  +#+     +#+     +#+        +#++:++#++ +#++:++#++: +#+    +:+ " },
        { "  +#+                      +#+        +#+    +#+ +#+       +#+ +#+    +#+  +#+        +#+    +#+ +#+  +#+#+# +#+           +#+    +#+    +#+ +#+  +#+#+# +#+     +#+  +#+    +#+  +#+    +#+    +#+        +#+     +#+         +#+    +#+ +#+    +#+  +#+       +#+     +#+     +#+        +#+    +#+ +#+     +#+ +#+    +#+ " },
        { " #+#                       #+#    #+# #+#    #+# #+#       #+# #+#    #+#  #+#        #+#    #+# #+#   #+#+# #+#    #+#    #+#    #+#    #+# #+#   #+#+# #+#     #+#  #+#    #+#  #+#    #+#    #+#        #+#     #+#         #+#    #+# #+#    #+#  #+#       #+#     #+#     #+#        #+#    #+# #+#     #+# #+#    #+# " },
        { "##########                  ########   ########  ###       ###  ########   ###         ########  ###    ####  ######## ########### ########  ###    #### ###     ###   ########   #########     ###        ###     ##########  #########   ########   ###       ### ########### ########## ###    ### ###     ###  ########  " }
    };

    return comoFunciona;
  }

  public static void imprimirNomeJogo() {
    String[][] byteDoMilhao = byteDoMilhao();
    int linhas = byteDoMilhao.length;
    int colunas = 0;

    for (int i = 0; i < linhas; i++) {
      System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t%s\n", byteDoMilhao[i][colunas]);
    }
  }

  public static void imprimirOpcao1() {
    String[][] paraJogar = paraJogar();
    int linhas = paraJogar.length;
    int colunas = 0;

    for (int i = 0; i < linhas; i++) {
      System.out.printf("%s\n", paraJogar[i][colunas]);
    }
  }

  public static void imprimirOpcao2() {
    String[][] comoFunciona = comoFuncionda();
    int linhas = comoFunciona.length;
    int colunas = 0;

    for (int i = 0; i < linhas; i++) {
      System.out.printf("%s\n", comoFunciona[i][colunas]);
    }
  }

  // Imprime as ASCII para o menu e le a interação para começar ou não o jogo
  public static void menu() {
    String mensagem = "O jogo funciona da seguinte maneira: Voce entrara no Reality Show do nosso apresentador Silício Santos, onde ele te perguntara coisas sobre informatica e voce devera\nresponder conforme a alternativa correta, conforme voce acerta ira subir nas patentes da empresa Empresa, voce começa como um simples estagiario mas pode até se tornar o\nBBB(Big Bill Boss), boa sorte!!\n\n";

    while (true) {
      System.out.println();
      imprimirNomeJogo();
      System.out.printf("\n\n");
      imprimirOpcao1();
      System.out.println();
      imprimirOpcao2();
      System.out.println();
      int interacaoMenu = tecladoScanner.nextInt();
      System.out.println();

      if (interacaoMenu == 1) {
        limparTela();
        System.out.println("Então vamos jogar");
        break;
      } else if (interacaoMenu == 2) {
        System.out.printf(
            "=============================================================================================================================================================================\n\n");
        System.out.print(mensagem);
        System.out.printf(
            "=============================================================================================================================================================================\n\n");
      } else {
        System.out.printf("Valor digitado invalido!!\n\n");
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
          "\nVejamos se não temos um mestre entre nós. Acho que este teste sera facil para o senhor mas mesmo assim vamos te colocar na posição de %s\n\n",
          suaPatente);
    } else if (nome.equals("Senhor Thiagolo")) {
      System.out.printf(
          "\nVejamos se não estamos com ele, com o magnifico, o grande, o incrivel, o SENHOR dos senhores, %s. Vamos ver se voce é capaz deste desafio, como lidara começando como %s?\n\n",
          nome, suaPatente);
    } else {
      System.out.printf("\nEntão vamos testar suas habilidades %s, voce começara na empresa como %s\n\n", nome,
          suaPatente);
    }
  }

  // Cria o vetor que armazena os cargos que a empresa possui
  public static String[] patentesNaEmpresa() {
    String[] patente = { "Estagiário de Desenvolvimento de Software", "Desenvolvedor Júnior",
        "Desenvolvedor Pleno", "Desenvolvedor Sênior", "Líder Técnico de Desenvolvimento",
        "Gerente de Desenvolvimento de Software", "BBB" };

    return patente;
  }

  public static String promover(String[] patente, int posicao) {
    String cargo = patente[posicao];
    return cargo;
  }

  public static void limparTela() {
    for (int i = 0; i < 40; i++) {
      System.out.println();
    }
    System.out.println("\033\143");

  }

  // Cria a matriz que armazena todas as perguntas e alternativas do jogo
  public static String[][] criarPerguntasEAlternativas() {
    String[][] perguntasEAlternativas = {
        { "1) O que acontece se você não incluir um break em um bloco de switch?", "A) O programa para imediatamente.",
            "B) Ele lança uma exceção.", "C) Ele continua para o próximo caso (case).",
            "D) O programa entra em loop infinito." },
        { "2) Oque torna um codigo PESSIMO?", "A) Não ter identação.", "B) Não ter metodos.", "C) Fazer tudo no main",
            "D) Todos os anteriores." },
        { "3) O que o método equals() faz em Java?",
            "A) Compara dois objetos para verificar se são idênticos na memória.",
            "B) Compara dois objetos para verificar se têm os mesmos valores.", "C) Retorna a referência do objeto.",
            "D) Faz uma cópia do objeto." },
        { "4) Qual estrutura de repetição deve ser usada quando o número de iterações é desconhecido?", "A) for.",
            "B) while", "C) do-while", "D) switch" },
        { "5) Qual a diferença entre == e o método equals() em Java?",
            "A) == verifica referências de objetos e equals() verifica valores.", "B) Ambos fazem a mesma verificação.",
            "C) == é usado para comparar Strings e equals() para números.",
            "D) == verifica valores e equals() verifica referências." },
        { "6) Qual é o valor retornado por Math.pow(2, 3) em Java?", "A) 6.", "B) 8.", "C) 9.", "D) 16." }, };

    return perguntasEAlternativas;
  }

  public static String[] criarAlternativasCorretas() {
    String[] alternativasCorretas = { "c", "d", "b", "b", "a", "b" };

    return alternativasCorretas;
  }

  public static void imprimirMensagemFinal(String nome, String suaPatente){
    System.out.printf(
        "=================================================================================================================================================================================\n\n");
    System.out.printf(
        "Não é que conseguiu chegar ate o final %s, estou impressionado. Voce terminou o meu show no cargo: %s. Que legal!! Obrigado por ter participado do\nmeu show e espero que voce chegue longe quando começar em uma empresa de informatica de verdade. Agora quem quer ver um pouco de El Debug Del 8? E logo depois disso voltaremos\ncom o Byte do Milhão apresentado por mim, Silicio Santos\n",
        nome, suaPatente);
    System.out.printf(
        "\n================================================================================================================================================================================\n\n");
    
  }

  public static void imprimirPerguntaEAlternativas(String[][] perguntasEAlternativas, int numPerguntas) {
    String[] perguntas = new String[perguntasEAlternativas.length];
    int colunas = perguntasEAlternativas[0].length;

    System.out.printf(
        "=============================================================================================================================================================================\n");
    for (int j = 0; j < colunas; j++) {
      perguntas[numPerguntas] = perguntasEAlternativas[numPerguntas][j];
      System.out.printf("%s\n\n", perguntas[numPerguntas]);
    }
    System.out.printf(
        "=============================================================================================================================================================================\n");

  }

  public static String perguntaDaAlternativa(String nome) {
    System.out.printf("Então %s, qual vai escolher? A, B, C ou D?\n", nome);
    String alternativaSelecionada = tecladoScanner.next().toLowerCase();

    while (true) {
      if (alternativaSelecionada.equals("a") || alternativaSelecionada.equals("b") || alternativaSelecionada.equals("c")
          || alternativaSelecionada.equals("d")) {
        break;
      } else {
        System.out.printf("Este é um valor invalido %s. Informe sua resposta novamente\n", nome);
        alternativaSelecionada = tecladoScanner.next().toLowerCase();
      }
    }

    return alternativaSelecionada;
  }

  public static void verificarSePerguntaCorreta(String alternativaSelecionada, String[] alternativasCorretas,
      int numPerguntas, String suaPatente, String[] patentes, String nome, int posicao,
      String[][] perguntasEAlternativas) {

    if (alternativasCorretas[numPerguntas].equals(alternativaSelecionada)) {
      posicao++;
      suaPatente = promover(patentes, posicao);
      System.out.printf(
          "\nParabens, voce realmente acertou %s. Agora eu vou te promover para a posicão de %s. Vamos para a proxima pergunta!!\n\n",
          nome,
          suaPatente);
    } else {
      System.out.printf(
          "\nQue pena %s, mas não desanima. Voce esta na patente %s. Vamos para a proxima pergunta!!\n\n",
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
          posicao, perguntasEAlternativas);

      // Fiz uma segunda verificação para promover e almentar posicao
      if (alternativasCorretas[numPerguntas].equals(alternativaSelecionada)) {
        posicao++;
        suaPatente = promover(patentes, posicao);
      }

      numPerguntas++;

    }

    // Imprime a mensagem final do programa
    imprimirMensagemFinal(nome, suaPatente);
    }
}