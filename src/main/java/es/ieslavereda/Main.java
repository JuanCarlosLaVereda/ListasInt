package es.ieslavereda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            lista.addHead(i);
        }
        for (int i = 0; i < 10; i++) {
            lista.addTail(i);
        }

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
        lista.addAll(new int[]{1,2,3,4,5,6,7,8,33});
        System.out.println(lista);
        Lista lista2 = new Lista(new int[]{33,33,33,33,33,33,33,33,33,33});
        System.out.println(lista2);
        System.out.println(Arrays.toString(lista.getAsArray()));
        //System.out.println(lista.contains(7));

/*        lista.clear();
        System.out.println(lista);
        System.out.println(lista.get(0));
        lista.addHead(3);
        System.out.println(lista);
        System.out.println(lista.get(0));*/
        /*        System.out.println(lista.contains(7));
        System.out.println(lista.contains(33));
        System.out.println(lista);*/
    }
}