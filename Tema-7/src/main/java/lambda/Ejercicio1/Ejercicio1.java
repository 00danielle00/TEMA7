package lambda.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejecutor ejecutor = new Ejecutor() {
            @Override
            public boolean prueba(int num) {
                if (num>10) {
                    return true;
                }else {
                    return false;
                }
            }
        };

        Ejecutor lambda =(numero) -> {
            if (numero>10){
                return true;
            }else {
                return false;
            }
        };

        boolean anonima=ejecutor.prueba(11);
        boolean lmda=lambda.prueba(2);
        System.out.println(anonima);
        System.out.println(lmda);



    }
}
