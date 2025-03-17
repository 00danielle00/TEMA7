package equals_hashcode;

import java.util.LinkedHashSet;

public class ImpresoraOnlline {
    static final String ID="PC3493";
    static LinkedHashSet<Peticion> listaPeticines = new LinkedHashSet<>();
    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.2.pdf");
        anyadirDocumento("lala.txt");
        anyadirDocumento("lala.pdf");
        anyadirDocumento("lala.pdf");
        imprimirDocumento();
        System.out.println(listaPeticines);
        System.out.println("Peticiones pendientes: "+getNumPeticiones());
        verTodo();
        imprimirTodo();
    }
    public static void anyadirDocumento(String nombre_fichero){
        if (nombre_fichero.endsWith(".pdf")){
            if(listaPeticines.add(new Peticion(ID,nombre_fichero))){
                System.out.println("Fichero "+nombre_fichero+" añadido a la cola de impresion");
            }else {
                System.out.println("Fichero "+nombre_fichero+ " ya existe en la cola");
            }
        }else {
            System.out.println("el archivo "+nombre_fichero+ " no tiene formato .pdf");
        }
    }
    public static void imprimirDocumento(){
        System.out.println("Imprimiendo... "+listaPeticines.getFirst().getNombre());
        listaPeticines.removeFirst();
    }
    public static int getNumPeticiones(){
        return listaPeticines.size();
    }
    public static void verTodo(){
        System.out.println("cola completa de impresion: "+listaPeticines);
    }
    public static void imprimirTodo(){
        while (listaPeticines.isEmpty()){
            imprimirDocumento();
        }
        System.out.println("La cola está vacías");
    }
}
