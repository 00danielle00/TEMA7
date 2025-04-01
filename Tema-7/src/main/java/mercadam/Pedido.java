package mercadam;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private HashMap<Producto, Integer> pedido = new HashMap<>();
    private double importe_total;

    public Pedido() {
        importe_total = 0.0;
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporte_total() {
        return importe_total;
    }

    public void setImporte_total(double importe_total) {
        this.importe_total = importe_total;
    }

    public void anyadirProducto(Producto producto) {
        importe_total += producto.getPrecio();
        pedido.put(producto, pedido.getOrDefault(producto, 0) + 1);
        System.out.println("Has añadido " + producto + " con precio " + producto.getPrecio() + "€");
        System.out.println("Importe total del carrito: " + importe_total + "€");
    }

    public void aplicarPromo3x2(){

    }
    public void aplicarPromo10(){
        importe_total*=0.9;
    }

    @Override
    public String toString() {
        return "Pedido{" + "pedido=" + pedido + ", importe_total=" + importe_total + '}';
    }
}
