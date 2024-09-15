package ex.felipeBoll_listaB_02;

import java.util.Scanner;

public class FelipeBoll_1132 {

  public static void descobrirMultiplos13() {
    Scanner tecladoScanner = new Scanner(System.in);

    int x = tecladoScanner.nextInt();
    int y = tecladoScanner.nextInt();

    /*
     * int maior;
     * int menor;
     * 
     * if(x > y){
     * maior = x;
     * menor = y;
     * } else if( y > x){
     * maior = y;
     * menor = x;
     * }
     * 
     * Tentativa que deu errado por falha na inicialização;
     * 
     */

    int maior = Math.max(x, y);
    int menor = Math.min(x, y);
    int soma = 0;

    for (int i = menor; i < maior; i++) {
      if (i % 13 != 0) {
        soma += i;
      }
    }

    System.out.println(soma);

    tecladoScanner.close();
  }

  public static void main(String[] args) {
    descobrirMultiplos13();
  }
}
