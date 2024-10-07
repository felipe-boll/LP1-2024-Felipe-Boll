package ex.felipeBoll_listaB_03;

public class FelipeBoll_1097 {
    
    public static void descobrirIJ3(int I, int J) {
        
        

        for(int i = I; i <= 9; i += 2){
            for(int j = J; j > j - 2 ; j--){
                System.out.printf("I=%d J=%d\n", i, j);
            }
        }
            
        

    }
    
    
    public static void main(String[] args) {
        
        int I = 1;
        int J = 7;
        
        descobrirIJ3(I, J);


    }
}