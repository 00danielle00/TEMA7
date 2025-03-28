package mercadam;

import java.util.Objects;

public class Cliente {
    private String usuario;
    private String contrasenya;
    private Pedido pedido;
    private String direccion;
    private boolean promociones;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        direccion="Calle falsa, 123";
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

    public boolean isPromociones() {
        return promociones;
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
        return "Cliente: " + "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones;
    }
}
