package es.ieslavereda;

import java.lang.reflect.Array;

public class ListaGenerica<E> {

    private Nodo<E> head;
    private Nodo<E> tail;
    private int size;

    public ListaGenerica(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }
    public Nodo<E> getHead() {
        return head;
    }
    public Nodo<E> getTail() {
        return tail;
    }

    public void addHead(E elem){
        Nodo<E> nodo = new Nodo<>(elem);
        if (size==0){
            tail = nodo;
        } else {
            nodo.setSiguiente(head);
            head.setAnterior(nodo);
        }
        size++;
        head = nodo;
    }

    public void addTail(E elem){
        Nodo<E> nodo = new Nodo<>(elem);
        if (size==0) {
            head = nodo;
        } else {
            tail.setSiguiente(nodo);
            nodo.setAnterior(tail);
        }
        size++;
        tail = nodo;
    }

    public E removeHead(){
        if (head==null){
            return null;
        }
        E elem = head.getElem();
        head = head.getSiguiente();
        if (head==null){
            tail = null;
        } else {
            head.setAnterior(null);
        }
        size--;
        return elem;
    }

    public E removeTail(){
        if (tail == null){
            return null;
        }
        E elem = tail.getElem();
        tail = tail.getAnterior();
        if (tail==null){
            head = null;
        }else {
            tail.setSiguiente(null);
        }
        size--;
        return elem;
    }

    //Esto es con reflexion que se da en segundo
    public E[] getAsArray(Class clazz){
        Nodo<E> nodoAux = head;
        E[] array = (E[])Array.newInstance(clazz, size);
        for (int i = 0; i <array.length; i++) {
            array[i] = nodoAux.getElem();
            nodoAux = nodoAux.getSiguiente();
        }
        return array;
    }

    public void clear(){
        head=null;
        tail=null;
        size=0;
    }

/*    public boolean contains(String elem){

    }*/

    @Override
    public String toString(){
        String aux = "Lista de elementos de tamaño: " + size() + "\nDe izquierda a derecha:\n(";
        Nodo<E> nodoAux=head;
        for (int i = 0; i <size ; i++) {
            aux+= nodoAux.toString() + "->";
            nodoAux = nodoAux.getSiguiente();
        }
        aux += ")\nDe derecha a izquierda:\n(";
        nodoAux = tail;
        for (int i = 0; i < size; i++) {
            aux+= "<-" + nodoAux.toString();
            nodoAux = nodoAux.getAnterior();
        }
        return aux + ")\n";
    }



    private class Nodo<E>{
        private Nodo<E> siguiente;
        private Nodo<E> anterior;
        private E elem;

        public Nodo(E elem){
            this.elem = elem;
            siguiente = null;
            anterior = null;
        }

        public Nodo<E> getSiguiente() {
            return siguiente;
        }
        public Nodo<E> getAnterior() {
            return anterior;
        }
        public E getElem() {
            return elem;
        }
        public void setSiguiente(Nodo<E> siguiente) {
            this.siguiente = siguiente;
        }
        public void setAnterior(Nodo<E> anterior) {
            this.anterior = anterior;
        }

        @Override
        public String toString(){
            return  elem.toString();
        }
    }
}
