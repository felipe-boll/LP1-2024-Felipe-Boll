package ex.ForFor;

import java.util.Scanner;

public class quadradoAvancado {

    public static void descobrirQuadradoAvancado(int n) {

        for (int i = 0; i < n; i++) {

            for (int x = 1; x < n; x++) {
                System.out.print("X");
            }

            for (int o = n - i; o < n; o++) {
                System.out.println("0");
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);

        int n = tecladoScanner.nextInt();

        descobrirQuadradoAvancado(n);

        tecladoScanner.close();
    }
}
