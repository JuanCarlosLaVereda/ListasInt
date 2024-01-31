package mapa;

import java.util.*;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Double> fruta = new HashMap<>();
        fruta.put("platano", 1.99);
        fruta.put("naranja", 1.19);
        fruta.put("clementina", 1.79);
        fruta.put("manzana", 0.99);
        fruta.put("platano", 1.79);


        System.out.println(fruta);

        //imprimir solo las claves
        for (String clave:fruta.keySet()) {
            System.out.print("-> " + clave);
        }
        System.out.println();
        //imprimir solo los valores
        for (Double valor: fruta.values()) {
            System.out.print("-> " + valor);
        }
        System.out.println();
        //imprimir clave-valor con el iterador
        Iterator<String> iterator = fruta.keySet().iterator();
        while (iterator.hasNext()){
            String clave = iterator.next();
            System.out.print(clave + " -> " + fruta.get(clave) + "|");
        }
        System.out.println();

        //imprimir con metodo forEach()
        fruta.forEach((clave, precio)->System.out.print(clave + " -> " + precio + "|"));
        System.out.println();
        List<Double> preciosCaros =
                fruta.values().stream().filter(precio->precio>1.00).collect(Collectors.toList());
        System.out.println(preciosCaros);
    }
}