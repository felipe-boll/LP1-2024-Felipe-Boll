package ex.CoisasAleatorias;

import java.util.Random;
import java.util.Scanner;

public class RanDentes {

  public static Random random = new Random();

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static String qualSeuNome() {
    System.out.println("Com quem estou falando?");
    String nome = tecladoScanner.next();

    return nome;
  }

  public static void falaPrincipal(String nome, String corSelecionada) {
    System.out.printf(
        "\n===============================================================================================================================================================================================\n\n");
    System.out.printf(
        "Então %s ta fazendo a manutenção do aparelho e quer uma nova cor mas não sabe oque escolher? Deixa comigo, vou aleatoriezar para voce, preparado?\nA cor excolhida para seus dentes no proximo mês foi: %s, parabens!!\n",
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
    String[] coresDoAparelho = criarVetorCores();
    String corSelecionada = aleatoriezarCores(coresDoAparelho);
    falaPrincipal(nome, corSelecionada);
  }
}
