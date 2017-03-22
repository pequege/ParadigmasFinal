package pkg101practice;

public class Cuadrado {
    private int lado;

    
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    public int area(){
        return lado * lado;
    }
    
    public void mostrar(){
        System.out.print("\nEl area del cuadrado es: " + area());
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
