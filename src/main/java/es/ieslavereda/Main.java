package es.ieslavereda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();

        for (int i = 0; i < 10; i++) {
            lista.addHead(i);
        }
        for (int i = 0; i < 10; i++) {
            lista.addTail(i);
        }
/*        System.out.println(lista);
        System.out.println(lista.removeHead());
        System.out.println(lista.removeTail());
        System.out.println(lista);

        ListaGenerica<Integer> listaEnteros = new ListaGenerica<>();
        listaEnteros.addHead(1);
        listaEnteros.addHead(33);
        listaEnteros.addTail(12);
        listaEnteros.addTail(5);
        System.out.println(listaEnteros);

        System.out.println(Arrays.toString(listaEnteros.getAsArray(Integer.class)));*/









//---------------------------------------------------------------------------------
        System.out.println(lista);
        lista.addTail(15);
        System.out.println(lista);
        lista.addHead(33);
        System.out.println(lista);
        System.out.println(lista.removeHead());
        System.out.println(lista);
        System.out.println(lista.removeTail());
        System.out.println(lista);
        System.out.println(lista.get(19));
        System.out.println(lista.remove(19));
        System.out.println(lista);
        lista.addAll(new Integer[]{1,2,3,4,5,6,7,8,33});
        System.out.println(lista);
        Lista<Integer> lista2 = new Lista<>(new Integer[]{33,33,33,33,33,33,33,33,33,33});
        System.out.println(Arrays.toString(lista.getAsArray(Integer.class)));
        //System.out.println(lista.contains(7));

        lista.clear();
        System.out.println(lista);
        System.out.println(lista.get(0));
        lista.addHead(3);
        System.out.println(lista);
        System.out.println(lista.get(0));
                System.out.println(lista.contains(7));
        System.out.println(lista.contains(33));
        System.out.println(lista);
    }
}