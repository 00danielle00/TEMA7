package tareas_funcionario;

import java.util.HashSet;
import java.util.Stack;

public class AppTareas {
    static Stack<Informe> pila = new Stack<>();
    static HashSet<Informe> listainforme = new HashSet<>();

    public static void main(String[] args) {

        pila.push(new Informe(1, "gola", Descripcion.ADMINISTRATIVO));
        pila.push(new Informe(1, "hola", Descripcion.ADMINISTRATIVO));
        pila.push(new Informe(2, "ir a por folios", Descripcion.ADMINISTRATIVO));
        pila.push(new Informe(1, "llamar", Descripcion.PERSONAL));
        pila.push(new Informe(2, "comprar pan", Descripcion.PERSONAL));


        while (!pila.isEmpty()) {

            System.out.println("Despachando...." + pila.pop());
        }
        System.out.println("pila vacia: " + pila);

        pila.push(new Informe(1, "gola", Descripcion.ADMINISTRATIVO));
        listainforme.add(new Informe(1, "gola", Descripcion.ADMINISTRATIVO));
        pila.push(new Informe(1, "hola", Descripcion.ADMINISTRATIVO));
        listainforme.add(new Informe(1, "hola", Descripcion.ADMINISTRATIVO));
        pila.push(new Informe(2, "ir a por folios", Descripcion.ADMINISTRATIVO));
        listainforme.add(new Informe(2, "ir a por folios", Descripcion.ADMINISTRATIVO));

        System.out.println(pila);


        for (int i = pila.size() - 1; i <= 0; i--) {
            System.out.println(pila.get(i));
        }

        System.out.println();
        System.out.println("Tienes " + listainforme.size() + " tipos de tareas");
        pila.pop();

    }
}
