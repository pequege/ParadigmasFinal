/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamiento;

import java.util.ArrayList;

/**
 *
 * @author EQUIPO
 */
public class Estacionamiento {
private ArrayList <Vehiculo>listavehiculo=new ArrayList<>();

    public Estacionamiento() {
    }


    public ArrayList<Vehiculo> getListavehiculo() {
        return listavehiculo;
    }

    public void setListavehiculo(ArrayList<Vehiculo> listavehiculo) {
        this.listavehiculo = listavehiculo;
    }
    
    public void agregarVehiculo(Vehiculo i){
        listavehiculo.add(i);
    }
    public void preciototal(){
        float total=0;
        //nombre_clase nom_objeto: nom_lista
        for(Vehiculo i : listavehiculo){
            total=total+i.getPrecio();
           
        }
        System.out.println("Precio total: "+total);
        
        
    }
    public void mostrarVehiculo(){
         for(Vehiculo i : listavehiculo){
             
             System.out.println(i.toString()+"precio: "+i.getPrecio());
         }
        System.out.println();
    }
    
    
    
    
}
