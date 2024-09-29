package ex.ForFor;

public class relogio {
    
    public static void relogioCompleto(){

        for(int hora = 00; hora < 24; hora++){

            for(int minuto = 00; minuto < 60; minuto++){
                System.out.printf("%02d:%02d\n", hora, minuto);
            }
        }
    }
    
    
    public static void main(String[] args) {
        relogioCompleto();
    }
}
