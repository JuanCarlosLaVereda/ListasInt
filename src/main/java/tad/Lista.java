package tad;

import java.lang.reflect.Array;

public class Lista<E> {

    private Nodo<E> head;
    private Nodo<E> tail;
    private int size;

    public Lista(){
        head=null;
        tail=null;
        size=0;
    }

    public Lista(E[] elements){
        this();
        addAll(elements);
    }

    public int size(){
        return size;
    }

    public void addHead(E elem){
        Nodo<E> nodo = new Nodo<>(elem);
        if (size==0){
            tail = nodo;
        } else {
            nodo.setSiguiente(head);
        }
        head = nodo;
        size++;
    }

    public void addTail(E elem){
        Nodo<E> nodo = new Nodo<>(elem);
        if (size==0){
            head = nodo;
        }else {
            tail.setSiguiente(nodo);
        }
        tail = nodo;
        size++;
    }

    public E removeHead(){
        if (head==null){
            return null;
        }
        E elem = head.getElem();
        head = head.getSiguiente();
        if (head==null){
            head = null;
            tail = null;
        }
        size--;
        return elem;
    }

    public E removeTail(){
        if (tail==null){
            return null;
        }
        if (size==1){
            removeHead();
        }
        E elem = tail.getElem();
        Nodo<E> nodoBeforeTail = head;
        for (int i=1; i<size-1; i++){
            nodoBeforeTail = nodoBeforeTail.getSiguiente();
        }
        nodoBeforeTail.setSiguiente(null);
        tail = nodoBeforeTail;
        size--;
        return elem;
    }

    public void clear(){
        head=null;
        tail=null;
        size=0;
    }

    public boolean contains(E elem){
/*        if (size==0){
            return false;
        }*/
        //No hace falta poner el size de arriba porque no entra en el for y no puede dar nullException
        Nodo<E> nodoAux = head;
        for (int i = 1; i < size; i++) {
            if (nodoAux.getElem().equals(elem)){
                return true;
            }
            nodoAux = nodoAux.getSiguiente();
        }
        return false;
    }

    public E get(int posiiton){
        if (posiiton<0 || posiiton>=size || size==0){
            return null;
        }
        Nodo<E> nodoAux = head;
        for (int i = 0; i<posiiton ; i++) {
            nodoAux = nodoAux.getSiguiente();
        }
        return nodoAux.getElem();

    }

    public E remove(int position){
        if (position<0 || position>=size){
            return null;
        }
        if (position==0){
            return removeHead();
        }
        if (position==size-1){
            return removeTail();
        }
        Nodo<E> nodoAux = head.getSiguiente();
        Nodo<E> nodoBeforeAux = head;
        for (int i = 1; i < position; i++) {
            nodoBeforeAux = nodoAux;
            nodoAux = nodoAux.getSiguiente();
        }
        nodoBeforeAux.setSiguiente(nodoAux.getSiguiente());
        E elem = nodoAux.getElem();
        size--;
        return elem;
    }

    public void addAll(E[] elements){
        for (E elem:elements) {
            addTail(elem);
        }
    }

    public E[] getAsArray(Class clazz){
        E[] array = (E[])Array.newInstance(clazz, size);
        Nodo<E> nodoAux = head;
        for (int i = 0; i < array.length; i++) {
            array[i] = nodoAux.getElem();
            nodoAux = nodoAux.getSiguiente();
        }
        return array;
    }



    @Override
    public String toString(){
        Nodo<E> nodoAux = head;
        String aux = "Lista de elementos de tamaño: " + size() + "\n(";
        while (nodoAux!=null){
            aux+=nodoAux.getElem() + "->";
            nodoAux = nodoAux.getSiguiente();
        }
        return aux + ")";

    }
    private class Nodo<E>{
        private E elem;
        private Nodo<E> siguiente;

        public Nodo(E elem){
            this.elem = elem;
            siguiente = null;
        }

        @Override
        public String toString(){
            return elem + "";
        }
        public E getElem() {
            return elem;
        }
        public Nodo<E> getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(Nodo<E> nodo) {
            siguiente = nodo;
        }
    }
}
