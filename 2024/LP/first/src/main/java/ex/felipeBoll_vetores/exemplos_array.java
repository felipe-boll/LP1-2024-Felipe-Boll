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
    
    
    public static void main(String[] args) {
        //ex1();
        ex2();
    }
}
