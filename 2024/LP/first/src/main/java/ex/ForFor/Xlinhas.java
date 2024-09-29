package ex.ForFor;

import java.util.Scanner;

public class Xlinhas {
    
    public static void quadrado(int n){
        
        // para cada linha
        for(int linhas = 0; linhas < n; linhas++){
            // imprime a linha
            for(int i = 0; i < n; i++){
            System.out.print("X");
            }
            System.out.println();
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);

        int n = tecladoScanner.nextInt();

        quadrado(n);

        tecladoScanner.close();
    }
}
