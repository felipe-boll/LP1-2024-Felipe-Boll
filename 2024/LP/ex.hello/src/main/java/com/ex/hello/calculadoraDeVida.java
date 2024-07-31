package com.ex.hello;

import java.util.Scanner;

public class calculadoraDeVida {

  final static public Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {
    int mes = 0;
    int dia = 0;

    System.out.println("Informe quantos meses:");
    mes = teclado.nextInt();

    System.out.println("Informe os dias:");
    dia = teclado.nextInt();

    int diaDeVida = dia + mes * 30;
    System.out.print("Seus dias de vida sao de: " + diaDeVida);

  }
}