package mercadam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import mercadam.Cliente;


public class AppZonaClientes {
    static Cliente cliente;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("** COMPRA ONLINE DE MERCADAM **");
        Mercadam.generarClientes();
        autenticacion(Mercadam.getClientes());
        iniciarCompra();

    }

    public static void autenticacion(Set<Cliente> clientes) {
        String usuario = "";
        String passwd = "";
        int contador = 3;
        for (mercadam.Cliente c : clientes) {

            do {
                System.out.print("Usuario: ");
                usuario = sc.next();
                System.out.print("Contraseña: ");
                passwd = sc.next();
                if (!usuario.equals(c.getUsuario()) && !passwd.equals(c.getContrasenya())) {
                    System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
                    contador--;
                    System.out.println("te quedan " + contador + " intentos!!");
                } else {
                    System.out.println("Autenticación correcta");
                    System.out.println("Bienvenid@ " + usuario);
                    cliente = c;
                    break;
                }
            } while (contador != 0);
            if (contador == 0) {
                System.out.println("ERROR DE AUTENTICACION");
            }
        }

    }

    public static void iniciarCompra() {
        cliente.setPedido(new Pedido());
        imprimirProductos();
        String respuesta = "";
        do {
            try {
                System.out.print("Elige un producto:");
                String productoElegido = sc.next().toUpperCase();
                Producto producto = Producto.valueOf(productoElegido);
                cliente.getPedido().anyadirProducto(producto);
                System.out.println("¿Quieres añadir más productos a tu carrito de la compra?[S/N]");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("s")){
                    imprimirProductos();

                }
            }catch (IllegalArgumentException e){
                System.out.println("algo no ha ido bien... Vuelve a intentarlo");
            }
        } while (!respuesta.equalsIgnoreCase("n"));
        cliente.getPedido().mostrarResumenCarrito();
        imprimirDespedida();

    }

    public static void imprimirProductos() {
        System.out.println("Añade productos a tu lista de la compra...");
        for (Producto p : Producto.values()) {
            System.out.println(p + " " + p.getPrecio() + "€");
        }
        System.out.println("=========================================");
    }

    public static void imprimirDespedida() {
        System.out.println("GRACIAS POR SU PEDIDO "+cliente.getUsuario()+". Se lo mandaremos a la dirección " + cliente.getDireccion());
    }
}
