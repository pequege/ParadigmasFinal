/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamiento;

/**
 *
 * @author EQUIPO
 */
public abstract class Vehiculo {
    private String patente;
    private String marca;
    private Fecha fecha;

    public Vehiculo(String patente, String marca, int dia,int mes,int año) {
        this.patente = patente;
        this.marca = marca;
        this.fecha = new Fecha(dia, mes, año);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return  "patente=" + patente + ", marca=" + marca + ", fecha=" + fecha + '}';
    }

public abstract float getPrecio();

 
    
}
