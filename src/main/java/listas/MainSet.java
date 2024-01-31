package listas;

import model.Persona;

import java.time.LocalDate;
import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        List<Persona> listaPersona = new ArrayList<>();
/*        for (int i = 0; i < 4; i++) {
            listaPersona.add(new Persona(i+"A", "Persona" + i, "el que te cuento", LocalDate.of(1999+i, 12, 23)));
        }*/
        listaPersona.add(new Persona("123567889", "zzzzzzzz", "zla que te cuento", LocalDate.of(2005, 12, 23)));
        listaPersona.add(new Persona("123", "uno", "la que te cuento", LocalDate.of(1999, 11, 23)));
        listaPersona.add(new Persona("1233", "auno", "la que te cuento", LocalDate.of(1999, 12, 23)));
        listaPersona.add(new Persona("1233", "auno", "la que te cuento", LocalDate.of(1999, 12, 23)));
        listaPersona.add(new Persona("1233", "auno", "la que te cuento", LocalDate.of(1999, 12, 23)));
        listaPersona.add(new Persona("1233", "auno", "la que te cuento", LocalDate.of(1999, 12, 23)));



        //personaSet.addAll(listaPersona);
        Set<Persona> personaSet = new HashSet<>(listaPersona);
        System.out.println(personaSet);

        Set<Persona> personaTreeSet = new TreeSet<>(listaPersona);
        System.out.println(personaTreeSet);

        Set<Persona> linkedSet = new LinkedHashSet<>(listaPersona);
        System.out.println(linkedSet);
    }
}
