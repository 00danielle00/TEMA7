package tareas_funcionario;

import java.util.Objects;

public class Informe {
    private int codigo;
    private String descripcion;
    private Descripcion tipo;


    public Informe(int codigo,String descripcion,Descripcion tipo) {
        this.codigo = codigo;
        this.descripcion=descripcion;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Descripcion getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}
