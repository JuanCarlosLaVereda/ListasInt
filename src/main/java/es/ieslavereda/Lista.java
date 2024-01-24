package es.ieslavereda;

public class Lista {

    private Nodo head;
    private Nodo tail;
    private int size;

    public Lista(){
        head=null;
        tail=null;
        size=0;
    }

    public Lista(int[] elements){
        this();
        addAll(elements);
    }

    public int size(){
        return size;
    }

    public void addHead(int elem){
        Nodo nodo = new Nodo(elem);
        if (size==0){
            tail = nodo;
        } else {
            nodo.setSiguiente(head);
        }
        head = nodo;
        size++;
    }

    public void addTail(int elem){
        Nodo nodo = new Nodo(elem);
        if (size==0){
            head = nodo;
        }else {
            tail.setSiguiente(nodo);
        }
        tail = nodo;
        size++;
    }

    public Integer removeHead(){
        if (head==null){
            return null;
        }
        int elem = head.getElem();
        head = head.getSiguiente();
        if (head==null){
            head = null;
            tail = null;
        }
        size--;
        return elem;
    }

    public Integer removeTail(){
        if (tail==null){
            return null;
        }
        if (size==1){
            removeHead();
        }
        int elem = tail.getElem();
        Nodo nodoBeforeTail = head;
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

    public boolean contains(int elem){
/*        if (size==0){
            return false;
        }*/
        //No hace falta poner el size de arriba porque no entra en el for y no puede dar nullException
        Nodo nodoAux = head;
        for (int i = 1; i < size; i++) {
            if (nodoAux.getElem()==elem){
                return true;
            }
            nodoAux = nodoAux.getSiguiente();
        }
        return false;
    }

    public Integer get(int posiiton){
        if (posiiton<0 || posiiton>=size || size==0){
            return null;
        }
        Nodo nodoAux = head;
        for (int i = 0; i<posiiton ; i++) {
            nodoAux = nodoAux.getSiguiente();
        }
        return nodoAux.getElem();

    }

    public Integer remove(int position){
        if (position<0 || position>=size){
            return null;
        }
        if (position==0){
            return removeHead();
        }
        if (position==size-1){
            return removeTail();
        }
        Nodo nodoAux = head.getSiguiente();
        Nodo nodoBeforeAux = head;
        for (int i = 1; i < position; i++) {
            nodoBeforeAux = nodoAux;
            nodoAux = nodoAux.getSiguiente();
        }
        nodoBeforeAux.setSiguiente(nodoAux.getSiguiente());
        int elem = nodoAux.getElem();
        size--;
        return elem;
    }

    public void addAll(int[] elements){
        for (int elem:elements) {
            addTail(elem);
        }
    }

    public int[] getAsArray(){
        int[] array = new int[size];
        Nodo nodoAux = head;
        for (int i = 0; i < array.length; i++) {
            array[i] = nodoAux.getElem();
            nodoAux = nodoAux.getSiguiente();
        }
        return array;
    }



    @Override
    public String toString(){
        Nodo nodoAux = head;
        String aux = "Lista de elementos de tamaño: " + size() + "\n(";
        while (nodoAux!=null){
            aux+=nodoAux.getElem() + "->";
            nodoAux = nodoAux.getSiguiente();
        }
        return aux + ")";

    }
    private class Nodo{
        private int elem;
        private Nodo siguiente;

        public Nodo(int elem){
            this.elem = elem;
            siguiente = null;
        }

        @Override
        public String toString(){
            return elem + "";
        }
        public int getElem() {
            return elem;
        }
        public Nodo getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(Nodo nodo) {
            siguiente = nodo;
        }
    }
}
