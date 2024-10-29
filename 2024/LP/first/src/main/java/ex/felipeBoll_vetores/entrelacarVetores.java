package ex.felipeBoll_vetores;

public class entrelacarVetores {

    public static void imprimirArraysInt(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("[%d]: %d\n", i, array[i]);
        }
    }
    
    public static int[] intercalarVetores(int[] v1, int[] v2){
        int[] vIntercalado = new int[v1.length + v2.length];

        for(int i = 0; i < vIntercalado.length; i++){
            if (i %2 == 0) {
                vIntercalado[i] = v1[i];
            } else
                vIntercalado[i] = v2[i];
        }

        return vIntercalado;
    }
    
    
    public static void main(String[] args) {
        int[] v1 = {1, 3, 5, 7};
        int[] v2 = {2, 4, 6, 8};

        int[] vIntercalado = intercalarVetores(v1, v2);

        imprimirArraysInt(vIntercalado);

    }
}
