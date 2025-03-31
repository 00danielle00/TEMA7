package mercadam;

import java.util.HashMap;

public class Pedido {
    private HashMap<Producto,Integer> pedido;
    private double importe_total;

    public Pedido() {
        importe_total = importe_total;
        pedido=new HashMap<>();
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public double getImporte_total() {
        return importe_total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importe_total=" + importe_total +
                '}';
    }
}
