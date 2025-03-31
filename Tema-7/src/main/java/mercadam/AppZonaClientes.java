package mercadam;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class AppZonaClientes {
   static mercadam.Cliente cliente;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mercadam m = new Mercadam();
        System.out.println("** COMPRA ONLINE DE MERCADAM **");

        iniciarCompra();
        imprimirProductos();
        System.out.println("Elige un producto:");
        String producto=sc.next().toUpperCase();
        cliente.insertarProducto(producto);
    }

    public static void autenticacion(Set<mercadam.Cliente> clientes) {
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
                }else {
                    System.out.println("Autenticación correcta");
                    System.out.println("Bienvenid@ "+usuario);
                    cliente=c;
                    break;
                }
            } while (contador != 0);
            System.out.println("Error de autenticación");
        }

    }

    public static void iniciarCompra() {
      Pedido p = new Pedido();
    }

    public static void imprimirProductos() {
        Producto producto = Producto.ACEITE;
        System.out.println("Añade productos a tu lista de la compra...");
        for (Producto p: Producto.values()){
            System.out.println(p+" "+p.getPrecio()+"€");
        }
        System.out.println("=========================================");
    }

    public static void imprimirDespedida() {

    }
}
