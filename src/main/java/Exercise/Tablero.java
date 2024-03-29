package Exercise;

import java.util.*;

public class Tablero{
    private Set<Bola> tablero;

    public Tablero(){
        tablero=new TreeSet<>();
    }

    public List<Bola> getList(){
        return new ArrayList<>(tablero);
    }

    public void addBola(Bola bola){
        tablero.add(bola);
    }

    public boolean check(Bola bola){
        return tablero.contains(bola);
    }

    public boolean checkAll(Collection<Bola> bolas){
        return tablero.containsAll(bolas);
    }

    @Override
    public String toString(){
        return tablero.toString();
    }
}
