package colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);
    static Deque<String>lista = new LinkedList<>();
    public static void main(String[] args) {

        String op ="";
        do{
            mostrarmenu();
            op= sc.next();
            cogeropcion(op);

        }while (!op.equalsIgnoreCase("X"));

    }
    public static void mostrarmenu(){
        System.out.println("---Lista de la compra---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar el primer producto");
        System.out.println("3. Eliminar producto por el nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");
        System.out.println("Seleccione una opción: ");
        System.out.println("-------------------------------");
    }
    public static void cogeropcion(String opcion){
        switch (opcion){
            case "1":
                System.out.println("Producto a añadir al final: ");
                String producto = sc.next();
                lista.offerLast(producto);
                break;
            case "2":
                System.out.println("Eliminar primer producto:");
                System.out.println("Eliminando primer producto: "+lista.pollFirst());
                break;
            case "3":
                System.out.println("Eliminar el primer producto:");
                String productoeliminar= sc.next();
                if (lista.contains(productoeliminar)){
                    lista.remove(productoeliminar);
                }else{
                    System.out.println("Producto no encontrado");
                }
                break;
            case "4":
                System.out.println("ver primer producto "+lista.peekFirst());
                break;
            case "5":
                System.out.println("¿QUe producto quieres buscar?");
                String buscar = sc.next();
                if (lista.contains(buscar)){
                    System.out.println("El producto se encuentra en la lista");
                }else {
                    System.out.println("El producto no se encuantra en la lista");
                }
                break;
            case "6":
                System.out.println("Lista actual: "+lista);
                break;
            default:
                break;
        }
    }

}
