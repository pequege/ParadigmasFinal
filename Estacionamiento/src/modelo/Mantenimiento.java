package modelo;

import java.util.ArrayList;

public class Mantenimiento {
    private ArrayList<Producto> productos;
    private boolean estado;
    
    public Mantenimiento(boolean estad){
        estado = estad;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
