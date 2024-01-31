package listas;

import model.Persona;


import java.time.LocalDate;
import java.util.*;

public class ListaComoInterfaz {
    //Declaro el objeto como clase, pero no es ok del to.do
    public static void main(String[] args) {
        ArrayList<String> listaArray = new ArrayList<>();
        listaArray.add("alo");
        listaArray.add("SIHOMBRE");
        listaArray.add("33");
        listaArray.add("LA QUE TE CUENTO");
        listaArray.add("EL QUE TE CUENTO");
        listaArray.add("Quien?");
        //imprimirArray(listaLinked); <--- No furula

        LinkedList<String> listaLinked = new LinkedList<>(listaArray);
        System.out.println(listaLinked);

        imprimir(listaArray);
        imprimir(listaLinked);

        List<Persona> listaPersona = new ArrayList<>();
/*        for (int i = 0; i < 4; i++) {
            listaPersona.add(new Persona(i+"A", "Persona" + i, "el que te cuento", LocalDate.of(1999+i, 12, 23)));
        }*/
        listaPersona.add(new Persona("123567889", "zzzzzzzz", "zla que te cuento", LocalDate.of(2005, 12, 23)));
        listaPersona.add(new Persona("123", "uno", "la que te cuento", LocalDate.of(1999, 11, 23)));
        listaPersona.add(new Persona("1233", "auno", "la que te cuento", LocalDate.of(1999, 12, 23)));


/*        for (Persona persona:listaPersona) {
            if (persona.getNombre().contains("o")){
                listaPersona.remove(persona);
            } else {
                System.out.println(persona);
            }

        }*/


/*        Iterator<Persona> iteradorPersona = listaPersona.iterator();
        Persona p;
        while (iteradorPersona.hasNext()){
            p = iteradorPersona.next();
            if (p.getNombre().contains("o")){
                iteradorPersona.remove();
            }
            System.out.println(p);
        }*/

        Collections.sort(listaPersona);
        System.out.println(listaPersona);
        listaPersona.sort(Persona.SORT_BY_AGE);
        System.out.println(listaPersona);

    }

    //NO TIENE SENTIDO REPETIR CODIGO!!!!!
    private static void imprimirArray(ArrayList<String> arrayList){
        for (String s:arrayList) {
            System.out.print(" - " + s);
        }
        System.out.println();
    }

    private static void imprimir(List<String> lista){
        for (String s:lista) {
            System.out.print(" - " + s);
        }
        System.out.println();
    }
}
