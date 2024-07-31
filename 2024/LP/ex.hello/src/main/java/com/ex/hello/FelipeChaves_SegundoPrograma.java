package com.ex.hello;

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 * Hello world
 */
public class FelipeChaves_SegundoPrograma {
  public static void main(String[] args) {
    Scanner leitorScanner = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    String nome = leitorScanner.nextLine();

    System.out.println("Qual é o seu peso?");
    float peso = leitorScanner.nextFloat();

    System.out.println("Qual é a sua idade?");
    int idade = leitorScanner.nextInt();

    System.out.println("Qual é o seu sexo? (M ou F)");
    char sexo = leitorScanner.next().charAt(0);

    if (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f') {
      System.out.println("Informe M ou F.");
      return;
    }

    System.out.println("Voce trabalha? ");
    boolean trabalha = leitorScanner.nextBoolean();

    System.out.println("\nRelatório do Usuário:");
    System.out.println("----------------------");
    System.out.printf("Nome: %s\n", nome);
    System.out.printf("Peso: %.2f kg\n", peso);
    System.out.printf("Idade: %d anos\n", idade);
    System.out.printf("Sexo: %c\n", sexo);
    System.out.printf("Trabalha: %b\n", trabalha);
    System.out.println("----------------------");

    leitorScanner.close();
  }
}