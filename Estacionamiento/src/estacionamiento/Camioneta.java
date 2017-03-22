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
public class Camioneta extends Vehiculo{
    private static final int precioHora=35;

    public Camioneta(String patente, String marca, int dia, int mes, int año) {
        super(patente, marca, dia, mes, año);
    }

   
    @Override
    public float getPrecio() {
        float total;
        total= precioHora;
        return total;
        
    }

    @Override
    public String toString() {
        return "Camioneta{" + super.toString()+'}';
    }

   
}
