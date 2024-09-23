package ex.felipeBoll_listaB_02;

public class FelipeBoll_1155 {

    public static void descobrirSequenciaS() {

        double S = 1;

        for (int i = 2; i <= 100; i++) {
            S += (float) 1 / i;
        }

        System.out.printf("%.2f\n", S);

    }

    public static void main(String[] args) {
        descobrirSequenciaS();
    }
}
