package lambda.lambdasOtro;

import java.util.Date;

public class Empleado {
    private String nombre;
    private double salario;
    private Date fecha;

    public Empleado(String nombre, double salario, Date fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Date getFecha() {
        return fecha;
    }
}
