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
public class Main {
    
    public static void main(String[] args) {
        Vehiculo v1= new Auto("ESR 205", "FORD", 2, 4, 2017);
        Vehiculo v2= new Auto("LRT", "Ferrari", 8, 11, 2013);
        Vehiculo v3= new Camioneta("UIM 108", "bmw", 1, 9, 2016);
        Vehiculo v4 = new Moto("QLM 874", "honda wave", 4, 8, 2018);
        Estacionamiento e1= new Estacionamiento();
        e1.agregarVehiculo(v1);
        e1.agregarVehiculo(v2);
        e1.agregarVehiculo(v3);
        e1.agregarVehiculo(v4);
        
     
        e1.mostrarVehiculo();
        e1.preciototal();
        
        
    }
    
}
