package ex.felipeBoll_listaB_04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FelipeBoll_1171 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int entrada = tecladoScanner.nextInt();
        int[] vetor = new int[entrada];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tecladoScanner.nextInt();
        }

        Map<Integer, Integer> contagem = new TreeMap<Integer, Integer>();

        for (int i = 0; i < vetor.length; i++) {
            contagem.compute(vetor[i], (numero, ocorrencia) -> {
                if (ocorrencia == null) {
                    return 1;
                } else {
                    return ocorrencia + 1;
                }
            });
        }

        for (var linha : contagem.entrySet()) {
            Integer numero = linha.getKey();
            Integer ocorrencia = linha.getValue();

            System.out.printf("%d aparece %d vez(es)\n", numero, ocorrencia);
        }
    }
}
