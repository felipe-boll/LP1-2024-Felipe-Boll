package ex.ForFor;

public class todosDiasEmDoisAnos {

    public static void descobrirDiasMesesAnos() {
        for (int a = 2023; a <= 2025; a++) {

            for (int m = 1; m <= 12; m++) {

                for (int d = 1; d <= 30; d++) {
                    if (d == 25 && m == 12) {
                        System.out.printf("%02d/%02d/%04d FELIZ NATAL!! não esquece meu presente\n", d, m, a);
                    } else
                        System.out.printf("%02d/%02d/%04d\n", d, m, a);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        descobrirDiasMesesAnos();
    }
}
