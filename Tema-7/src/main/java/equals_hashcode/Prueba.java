package equals_hashcode;

import java.util.LinkedHashSet;

public class Prueba {
    public static void main(String[] args) {
        Paciente raul= new Paciente("123456", "Raul","García Delgado");
        Paciente xavi = new Paciente("234567", "Javier", "Cervera Lillo");
        Paciente javi = new Paciente("234567", "Javier", "Cervera Lillo");


        LinkedHashSet<Paciente> listaPacientes = new LinkedHashSet<>();
        listaPacientes.add(raul);
        listaPacientes.add(xavi);
        listaPacientes.add(javi);

        System.out.println(listaPacientes);

    }
}
