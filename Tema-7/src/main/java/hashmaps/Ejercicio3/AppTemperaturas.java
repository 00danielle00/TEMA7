package hashmaps.Ejercicio3;

import java.util.HashMap;

public class AppTemperaturas {

    public static void main(String[] args) {
        RegistroTemperaturas registroTemperaturas = new RegistroTemperaturas();

        registroTemperaturas.insertarTemperaturas("Alicante",32);
        registroTemperaturas.insertarTemperaturas("Mutxamel",23);
        registroTemperaturas.insertarTemperaturas("San juan",22);

        registroTemperaturas.mostrarTodo();
    }

}
