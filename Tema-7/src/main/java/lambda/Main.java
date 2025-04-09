package lambda;

public class Main {
    public static void main(String[] args) {
        Prueba prueba = new Prueba() {
            @Override
            public String prueba(String texto) {
                System.out.println("Hola desde "+texto);
                return texto.toUpperCase();
            }
        };

        Prueba lambda =(texto) -> {
            System.out.println("Hola desde "+texto);
            return texto.toUpperCase();
        };
        String resultadoanonima= prueba.prueba("hula");
        String resultadoLambda=lambda.prueba("homelo");
        System.out.println(resultadoanonima);
        System.out.println(resultadoLambda);
    }
}


