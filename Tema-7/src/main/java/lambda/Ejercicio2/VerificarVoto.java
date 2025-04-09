package lambda.Ejercicio2;

import lambda.lambda_conClasses.Persona;

@FunctionalInterface
public interface VerificarVoto {
    boolean puedeVotar(Persona persona);
}
