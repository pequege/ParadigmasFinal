package modelo;

import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<Tarifa> tarifas = new ArrayList<>();
    private String nombre = "THE STATION";
    private String direccion = "Rivadavia 1052";

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Estacionamiento() {
    }
    
    public void AgregarTarifa(Tarifa t){
        tarifas.add(t);
    }
    
    public void EliminarTarifa(int x){
        tarifas.remove(x);
    }
}
