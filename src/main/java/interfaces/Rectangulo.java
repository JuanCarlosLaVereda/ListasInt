package interfaces;

public class Rectangulo implements IFigura,Relatable{

    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura){
        this.altura = altura;
        this.base = base;
    }

    public Double getBase() {
        return base;
    }
    public Double getAltura() {
        return altura;
    }

    @Override
    public Double area(){
        return base*altura;
    }

    @Override
    public Double perimetro(){
        return (base*2)+(altura*2);
    }

    @Override
    public boolean isLargerThan(Relatable relatable){
        if (relatable==null || !(relatable instanceof Rectangulo)){
            return false;
        }
        Rectangulo rectangulo = (Rectangulo) relatable;
        return area()>rectangulo.area();
    }

}
