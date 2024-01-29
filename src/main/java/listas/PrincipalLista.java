package listas;

import java.util.ArrayList;
import java.util.List;

public class PrincipalLista {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(6);
        listaEnteros.add(10);
        listaEnteros.add(33);
        System.out.println(listaEnteros.size());
        System.out.println(listaEnteros);
        listaEnteros.remove(4);
        System.out.println(listaEnteros);
        listaEnteros.addAll(List.of(37,34,35));
        System.out.println(listaEnteros);
        listaEnteros.set(2,4);
        System.out.println(listaEnteros);
    }
}
