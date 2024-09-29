package ex.ForFor;

public class tabuada {
    
    public static void tabuadaF(){
        for(int i = 1; i <= 10; i++){
            
        System.out.println("====================================================");
        System.out.printf("\nTABUADA DO %d\n", i);
        System.out.println();

            for(int j = 1; j <= 10; j++){
                int resultadoTabuada = i * j;
                System.out.printf("%02d X %02d = %d\n", i, j, resultadoTabuada);
                
            }
            
        System.out.println();
        System.out.println("====================================================");

        }
    }
    
    
    
    public static void main(String[] args) {
        tabuadaF();
    }
}
