package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class exLoop5 {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int limiteMax = 0;
        int limiteMin = 0;
        int i = 0;
        int soma = 0;

        limiteMin = lerNumeroInteiro();
        limiteMax = lerNumeroInteiro();

        soma = somar(limiteMin, limiteMax, i);
        imprimir(soma);
    }

    public static void imprimir(int soma) {
        System.out.println(soma);
    }

    public static int somar(int limiteMin, int limiteMax, int i) {
        int soma = 0;

        i = limiteMin;

        if (i == limiteMin) {
            i++;
        }
        do {
            soma = soma + i;
            i++;
        } while (i < limiteMax);
        return soma;
    }

    public static int lerNumeroInteiro() {
        int valor = 0;

        do {
            valor = LER.nextInt();
        } while (valor < 0);

        return valor;
    }
}