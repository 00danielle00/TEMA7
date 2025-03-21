package diccionario_español_ingles;

public class AppDiccionario {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        diccionario.nuevoPar("perro", "dog");
        diccionario.nuevoPar("mesa","table");
        diccionario.nuevoPar("coche","car");

//        diccionario.traduce("perro");
        diccionario.palabraAleatoria();
        diccionario.primeraLetraTraduccion("perro");
    }

}
