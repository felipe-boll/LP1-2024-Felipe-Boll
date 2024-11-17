package ex.felipeBoll_listaB_04;

import java.util.Scanner;

public class FelipeBoll_1179 {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] par = new int[5];
    int[] impar = new int[5];

    for (int i = 0, j = 0; (i + j) < 15;) {
      int entrada = tecladoScanner.nextInt();

      if (entrada % 2 == 0) {
        int indice = i % par.length;
        par[indice] = entrada;
        System.out.printf("par[%d] = %d\n", indice, par[indice]);
        i++;
      } else {
        int indice = j % impar.length;
        impar[indice] = entrada;
        System.out.printf("impar[%d] = %d\n", indice, impar[indice]);
        j++;
      }

    }
  }
}
/*
 * par[0] = 4
 * par[1] = -4
 * par[2] = 2
 * par[3] = 8
 * par[4] = 2
 * impar[0] = 1
 * impar[1] = 3
 * impar[2] = 3
 * impar[3] = 5
 * impar[4] = -7
 * impar[0] = 789
 * impar[1] = 23
 * par[0] = 54
 * par[1] = 76
 * par[2] = 98
 *
 * impar[0] = 1
 * impar[1] = 3
 * par[0] = 4
 * par[1] = -4
 * par[2] = 2
 * impar[0] = 3
 * par[0] = 8
 * par[1] = 2
 * impar[0] = 5
 * impar[1] = -7
 * par[0] = 54
 * par[1] = 76
 * impar[0] = 789
 * impar[1] = 23
 * 
 * 
 * 
 * 
 * 
 */
