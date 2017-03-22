package pkg101practice;

public class Cubo extends Cuadrado{
    private final String color;
    
    public Cubo(int lado, String color) {
        super(lado);
        this.color = color;
    }
    
    public int vol(){
        return (getLado()*getLado()*getLado());
    }
    
    public void mostrarCubo(){
        System.out.print("\nCubo");
        System.out.print("\nLado: " + vol());
        System.out.print("\nColor: " + color);
    }
}
