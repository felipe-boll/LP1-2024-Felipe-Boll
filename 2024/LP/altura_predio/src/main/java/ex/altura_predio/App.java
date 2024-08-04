package ex.altura_predio;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static float lerValorFloat() {
        float valor = tecladoScanner.nextFloat();
        return valor;
    }

    public static void imprimir(String message) {
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("=" + message);
        System.out.println("--------------------------------------------------------");
        System.out.println();

    }

    public static float calcularAlturaPredio(int andares, float alturaAndares) {

        float alturaPredio = 0;

        // Calculo
        alturaPredio = andares * alturaAndares;

        return alturaPredio;
    }

    public static void imprimirResultado(float alturaPredio) {
        System.out.printf("Este prédio tem: %f", alturaPredio);
    }

    public static void main(String[] args) {

        // Entrada

        imprimir("Informe a quantidade de andares");
        int andares = lerValorInteiro();

        imprimir("Informe a altura dos andares");
        float alturaAndares = lerValorFloat();

        // Processamento

        float alturaPredio = calcularAlturaPredio(andares, alturaAndares);

        // Saída

        imprimirResultado(alturaPredio);
        tecladoScanner.close();
    }

}
