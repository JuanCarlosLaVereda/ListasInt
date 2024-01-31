package Exercise;

import java.util.*;

public class Bombo {
    Set<Bola> bombo;

    public Bombo(){
        bombo = new LinkedHashSet<>();
    }

    public Bombo(Collection<Bola> bolas){
        bombo = new LinkedHashSet<>(bolas);
    }
    public void initialize(){
        for (int i = 1; i < 90; i++) {
            bombo.add(new Bola(i));
        }
    }

    public void girar(){
        List<Bola> bolaList = new LinkedList<>(bombo);
        Collections.shuffle(bolaList);

        bombo.clear();
        bombo.addAll(bolaList);
    }

    public void addBola (Bola bola){
        bombo.add(bola);
    }
    public void addBolas (Collection<Bola> bolas){
        bombo.addAll(bolas);
    }
    public Bola getBall(){
        List<Bola> bolaList = new LinkedList<>(bombo);
        Bola bola = bolaList.get(0);
        bombo.remove(bola);
        return bola;
    }

    public Bola getBola(){
        Bola bola = null;
        Iterator<Bola> iterator = bombo.iterator();
        if (iterator.hasNext()){
            bola = iterator.next();
            iterator.remove();
        }
        return bola;
    }



    public Set<Bola> getBombo() {
        return bombo;
    }

    @Override
    public String toString(){
        return bombo.toString();
    }


}
