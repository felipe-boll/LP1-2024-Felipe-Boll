import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class atividade {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(LinkedList<Integer> lista){
        for(Integer indice : lista){
            System.out.printf("%d ", indice);
        }
        System.out.println();
    }

    public static void encontrarElemento(LinkedList<Integer> lista){
        System.out.printf("Qual valor deseja encontrar?");
        int valorDesejado = tecladoScanner.nextInt();
        System.out.printf("Seu valor esta no indice: %d\n", lista.indexOf(valorDesejado));
    }

    public static void ordenarLista(LinkedList<Integer> lista){
        System.out.printf("Lista ordenada:\n");
        Collections.sort(lista);

        imprimir(lista);
    }

    public static void adicionarElemento(LinkedList<Integer> lista){
        System.out.printf("Qual valor voce quer inserir?" );
        int valorInserir = tecladoScanner.nextInt();
        lista.add(valorInserir);

        imprimir(lista);
    }

    public static void deletarValor(LinkedList<Integer> lista){
        System.out.printf("Qual o index do valor que deseja deletar? ");
        int valorDeletar = tecladoScanner.nextInt();
        lista.remove(valorDeletar);

        imprimir(lista);
    }

    public static void main(String[] args) {

        // minha lista
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(2);
        lista.add(8);
        lista.add(0);
        lista.add(7);
        lista.add(2);
        lista.add(0);
        lista.add(0);
        lista.add(9);

        encontrarElemento(lista);
        ordenarLista(lista);
        adicionarElemento(lista);
        deletarValor(lista);
    }
}
