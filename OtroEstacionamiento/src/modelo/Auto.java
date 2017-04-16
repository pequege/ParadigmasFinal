package modelo;
public class Auto {
    private int cantidadPuertas;

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
