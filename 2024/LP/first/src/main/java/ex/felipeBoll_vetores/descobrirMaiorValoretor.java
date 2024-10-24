package ex.felipeBoll_vetores;

public class descobrirMaiorValoretor {
    
    public static int obterMaior(array[]){
        int maior = array[0];
        for(int i = 1; i < array.lenght; i++){
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public static int obterPosicaoDoMaior(int[] array){
        int maior = array[0];
        int posicaoDoMaior = 0;

        for(int i = 1; i < array.length; i++){
            
        }
    }
    
    
    public static void main(String[] args) {
        int[] array = {20, 3, -9, 78, 2, 1};
        int maior = obterMaior();
        int posicaoDoMaior


        System.out.printf("O maior valor eh: %d\n", maior);
    }
}
