package ex.CoisasAleatorias;

import java.util.Random;
import java.util.Scanner;

public class RanDentes {

  public static Random random = new Random();

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static String qualSeuNome() {
    System.out.println("Com quem estou falando?");
    String nome = tecladoScanner.next().toLowerCase();

    if (nome.equals("felipe")) {
      nome = "meu Criador";
    }

    return nome;
  }

  public static void falaPrincipal(String nome, String corSelecionada) {
    System.out.printf(
        "\n===============================================================================================================================================================================================\n\n");
    System.out.printf(
        "Então %s, esta fazendo a manutenção do aparelho e quer uma nova cor mas não sabe oque escolher? Deixa comigo, vou aleatoriezar para voce, preparado?\nA cor excolhida para seus dentes no proximo mês foi: %s, parabens!!\n",
        nome, corSelecionada);
    System.out.printf(
        "\n===============================================================================================================================================================================================\n\n");
  }

  public static String aleatoriezarCores(String[] coresDoAparelho) {
    int posicaoAleatoria = random.nextInt(coresDoAparelho.length);
    String corSelecionada = coresDoAparelho[posicaoAleatoria];

    return corSelecionada;
  }

  public static String[] criarVetorCores() {
    String[] cores = { "Verde Cristal", "Verde Mar", "Verde Perola", "Cinza", "Prateado", "Azul", "", "Roxo", "Rosa" };

    return cores;
  }

  public static void main(String[] args) {
    String nome = qualSeuNome();
    int outraChance = 3;
    String[] coresDoAparelho = criarVetorCores();

    while (outraChance > 0) {

      String corSelecionada = aleatoriezarCores(coresDoAparelho);
      falaPrincipal(nome, corSelecionada);

      System.out.printf(
          "Você tem %d chances para escolher uma cor, se não gostar da cor escolhida, digite 'sair' para finalizar o programa ou 'continuar' para tentar novamente.\n",
          outraChance);
      String resposta = tecladoScanner.next().toLowerCase();

      if (resposta.equals("sair")) {
        System.out.println("Ok, até a próxima!");
        return;
      } else if (resposta.equals("continuar")) {
        outraChance--;
        if (outraChance == 0) {
          System.out.println("Você não tem mais chances. O programa será finalizado.");
          return;
        }
      } else {
        System.out.println("Resposta inválida. Tente novamente.");
        continue;
      }
      
    }
  }
}
