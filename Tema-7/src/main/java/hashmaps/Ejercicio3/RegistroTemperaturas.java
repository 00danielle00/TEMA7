package hashmaps.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {
    static Scanner sc = new Scanner(System.in);
    private HashMap<String, Integer> mapatemperaturas;

    public RegistroTemperaturas() {
        mapatemperaturas = new HashMap<>();
    }

    public void insertarTemperaturas(String ciudad, Integer temperatura) {
        mapatemperaturas.put(ciudad, temperatura);
    }

    public void actualizarTemperatura(String ciudad) {
        System.out.println("Inserta la nueva temperatura de la ciudad " + ciudad);
        mapatemperaturas.put(ciudad, sc.nextInt());
    }

    public void consultarTemperatura() {
        System.out.println("Introduce la ciudad a consultar ");
        String ciudad = sc.next();
        if (mapatemperaturas.containsKey(ciudad)){
            System.out.println("La temperatura en "+ciudad+" es de "+mapatemperaturas.get(ciudad));
        }else{
            System.out.println("La ciudad "+ciudad+ " no tiene tempereatura registrada");
        }

    }
    public void mostrarTodo(){
        System.out.println("Registro de temperaturas:");
        for (Map.Entry<String,Integer> map: mapatemperaturas.entrySet()){
            System.out.println(map.getKey()+": "+map.getValue()+"º");
        }
    }

    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "mapatemperaturas=" + mapatemperaturas +
                '}';
    }
}
