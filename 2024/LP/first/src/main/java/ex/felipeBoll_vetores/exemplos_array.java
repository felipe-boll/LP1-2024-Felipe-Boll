package ex.felipeBoll_vetores;

public class exemplos_array {
    
    
    public static void ex1(){
        int[] n = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println(n[2]);

        n[2] = 99;
        System.out.println(n[2]);

        // tamanho do vetor
        System.out.printf("Tamanho = %d\n", n.length);

    }


    public static void ex2(){
        int[] n = {1, 3, 5, 7, 9, 11, 13, 15};

        for(int i = 0; i < n.length; i++){
            System.out.printf("[%d]: %d\n", i, n[i]);
        }

    }

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d]: %d\n", i, array[i]);
        }
    }
    


    public static void ex3(){
        int[] n = {1, 3, 5, 7, 9, 11, 13, 15};

        imprimirArraysInt(n);

    }

    public static void ex4(){
        int[] n = {1, 3, 5, 7, 9, 11, 13, 15};

        for(int i = n.length - 1; i < 0; i--){
            System.out.printf("[%d]: %d\n", i, n[i]);
        }
    }

    public static void ex5(){
        //int[] n;

        //imprimirArraysInt(n); // Erro;
    }

    public static int[] criarArrayInt(int tamanho, int valorPreenchimento){
        int[] array;
        array = new int[tamanho];

        for(int i = 0; i < array.length; i++){
            array[1] = valorPreenchimento;
        }

        return array;

    }

    public static int somaArrayInt(int[] array){
        int soma = 0;
        
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }

        return soma;

    }

    public static void ex7(){
        int[] n = {1, 3, 5, 7, 9, 11, 13, 15};
        int soma = somaArrayInt(n);

        System.out.printf("A soma do vetor:\n%d\nEh = %d\n", n, soma);

    }
    
    
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();

        ex7();

    }
}
