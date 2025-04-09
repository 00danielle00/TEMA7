package lambda.lambda_conClasses;

import lambda.Ejercicio2.VerificarVoto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan",16));
        personas.add(new Persona("Ana",22));
        personas.add(new Persona("Pedro",18));
        personas.add(new Persona("Luis",17));

        VerificarVoto voto = persona -> persona.getEdad() >=18;

        List<String> personasquepuedenVotar = new ArrayList<>();

        for (Persona p:personas){
            if (voto.puedeVotar(p)){
                personasquepuedenVotar.add(p.getNombre());
            }
        }

        System.out.println("Personas que pueden votar:");
        for (String p: personasquepuedenVotar){
            System.out.println(p);
        }
    }
}
