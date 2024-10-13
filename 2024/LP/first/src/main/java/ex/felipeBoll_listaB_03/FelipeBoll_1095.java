package ex.felipeBoll_listaB_03;

public class FelipeBoll_1095 {

    public static void descobrirIJ() {

        int I = 1;

        for (int j = 60; j >= 0; j -= 5) {

            System.out.printf("I=%d J=%d\n", I, j);

            I += 3;

        }
    }

    public static void main(String[] args) {
        descobrirIJ();
    }
}
