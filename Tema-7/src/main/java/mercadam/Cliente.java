package mercadam;

import mercadam.Pedido;

import java.util.*;

public class Cliente {

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        direccion = "Calle falsa, 123";
        pedido = null;
        promociones = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public boolean getPromociones() {
        return promociones;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    public void crearPedido() {
        pedido = new Pedido();
    }

    public double importePedido(){

        System.out.println("**RESUMEN DEL CARRITO DE LA COMPRA**");
        System.out.println("Productos:");
        for (Map.Entry<Producto, Integer> map : pedido.getPedido().entrySet()) {
            System.out.println("\t" + "- " + map.getValue() + " " + map.getKey() + " " + map.getKey().getPrecio() + "€");
        }
        System.out.println();
        System.out.println("IMPORTE TOTAL: " + pedido.getImporte_total() + "€");
        System.out.println();
        return 0;
    }

    public void insertarProducto(String producto) {

        boolean encontrado = false;
        for (Producto p : Producto.values()) {
            if (p.name().equalsIgnoreCase(producto)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El producto no existe! Elige otro");
            AppZonaClientes.imprimirProductos();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario) && Objects.equals(contrasenya, cliente.contrasenya);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenya);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}