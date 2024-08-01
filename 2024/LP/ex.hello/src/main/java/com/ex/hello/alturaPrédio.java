// um prédio e o número de andares, calcule e imprima a altura do prédio.

import java.util.Scanner;

public class alturaPrédio {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro () {
        int valor = tecladoScanner.nextInt();
        return valor
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

    public static float calcularAlturaPrédio(int andares, float alturaAndares);

    {

        float alturaPredio = 0;

        // Calculo
        alturaPredio = andares * alturaAndares;

        return alturaPredio;
    }

    public static void imprimirResultado(float alturaPredio) {
        System.out.println("Este prédio tem:" + alturaPredio);
    }

    public static void main(float[] args) {

        // Entrada

        System.out.println("Informe a quantidade de andares");
        andares = lerValorInteiro();

        System.out.println("Informe a altura dos andares");
        alturaAndares = lerValorFloat();

        // Processamento

        alturaPredio = calcularAlturaPrédio(andares, alturaPredio);

        // Saída

        imprimirResultado(0);
    }

}
