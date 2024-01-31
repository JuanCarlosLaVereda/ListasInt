package Exercise;

public class Bola implements Comparable<Bola>{
    private int numero;

    public Bola(Integer numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Bola bola){
        return numero-bola.getNumero();
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Bola)){
            return false;
        }
        Bola bola = (Bola) obj;
        return numero ==bola.getNumero();
    }
    @Override
    public int hashCode(){
        return numero;
    }
    @Override
    public String toString(){
        return numero +"";
    }
}
