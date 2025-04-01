package stringbuilder;

public class Estrings {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hola ");
        stringBuilder.append("qué tal"); //insertar despues de lo que ya tenga
        stringBuilder.insert(5, "soy danielle "); //lo mete en la posicion 5
        stringBuilder.replace(5,8," somos ");
        stringBuilder.delete(5,12);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
