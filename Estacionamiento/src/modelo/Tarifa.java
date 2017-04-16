package modelo;

import modelo.Servicio;
import modelo.Vehiculo;

public class Tarifa {
    private Vehiculo vehiculo;
    private Servicio servicio;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Tarifa() {
    }

    @Override
    public String toString() {
        return "Tarifa{" + "vehiculo=" + vehiculo + ", servicio=" + servicio + '}';
    }
   
}
