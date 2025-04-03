package mercadam;

import java.util.*;

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
        for (Map.Entry<Producto,Integer> mapaDescuento: pedido.entrySet()){
            Producto a =mapaDescuento.getKey();
            int unidades = mapaDescuento.getValue();

            double descuento = unidades/3;
            if (unidades>0){
                double total = descuento* mapaDescuento.getKey().getPrecio();
                importe_total-=total;
                System.out.println("PROMO 3X2 Y 10% APLICADAS");
                System.out.println("Descuento de: "+total+" precio final del producto "+mapaDescuento.getKey().name()
                 +" total "+importe_total);
            }
        }

    }
    public void aplicarPromo10(){
        double descuento = 0.1;
        importe_total-=descuento;
        System.out.println("Descuento de: "+descuento+" precio final:"+importe_total+"€");
    }
    public void mostrarResumenPedido(){
        List<Map.Entry<Producto,Integer>>mapa = new ArrayList<>(pedido.entrySet());
        mapa.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        for (Map.Entry<Producto,Integer> m :mapa){
            System.out.println("\t"+m.getValue()+" - "+m.getKey()+" "+m.getKey().getPrecio()+"€");
        }
    }

    @Override
    public String toString() {
        return "Pedido{" + "pedido=" + pedido + ", importe_total=" + importe_total + '}';
    }
}
