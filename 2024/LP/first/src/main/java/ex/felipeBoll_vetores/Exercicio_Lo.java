package ex.felipeBoll_vetores;

public class Exercicio_Lo {
    
    public static int[] somaVetores(int[] vetor1, int[] vetor2){
        
        if (vetor1 == null || vetor2 == null) {
            return null;
        }


        if (vetor1.length != vetor2.length) {
            return null;
        }

        int[] resultado = new int[vetor1.length];

        for(int i = 0; i < resultado.length; i++){
           resultado[i] = vetor1[i] + vetor2[i];
        }
        
        return resultado;
        
    }

    public static boolean isVetoresIguais(int[] resultado, int[] resultadoEsperado){
        
        
        if (resultado.length != resultadoEsperado.length) {
            return false;
        }
        
        
        
        for(int i = 0; i < resultadoEsperado.length; i++){
            if (resultado[i] != resultadoEsperado[i]) {
                return false;
            }
        }

        return true;

    }
    
    
    
    public static void main(String[] args) {
        
        int[] vetor1 = {1, 3, 5, 7, 9};
        int[] vetor2 = {2, 2, 2, 2};
        
        int[] resultadoEsperado = {3, 5, 7, 9};
        int[] resultado = somaVetores(vetor1, vetor2);

        if (somaVetores(vetor1, vetor2) == null) {
            System.out.println("ERRO!");
        }


        boolean iguais = isVetoresIguais(resultado, resultadoEsperado);
        
        if (iguais = true) {
            System.out.println();
            System.out.println("tudo certo");
            System.out.println();
        } else
            System.out.println("Algo de errado não está certo");



        for(int i = 0; i < resultado.length; i++){
            System.out.printf("[%d]: %d\n", i, resultado[i]);
        }
    }
}
