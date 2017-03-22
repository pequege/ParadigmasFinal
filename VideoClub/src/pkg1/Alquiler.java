/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.ArrayList;

public class Alquiler {
    private String fechaAlquiler;
    private String fechaDevolucion;
    private Empleado empleado;
    private ArrayList<Pelicula> peliculas;
    
    public ArrayList<Pelicula> getPeliculas(){
        return peliculas;
    }
    
    public void setPeliculas(ArrayList<Pelicula> peliculas){
        this.peliculas = peliculas;
    }
    
    public String getFechaAlquiler(){
        return fechaAlquiler;
    }
    
    public void setFechaAlquiler(String fechaAlquiler){
        this.fechaAlquiler = fechaAlquiler;
    }
    
    public String getFechaDevolucion(){
        return fechaDevolucion;
    }
    
    public void setFechaDevolucion(String fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public Empleado getEmpleado(){
        return empleado;
    }
    
    public void setEmpleado(Empleado empleado){
        this.empleado = empleado;
    }
    
    public void addPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    
    //Composicion
    //public Alquiler(String fechaAlquiler, String fechaDevolucion, String nombre, String dni, String turno){
    //    this.fechaAlquiler = fechaAlquiler;
    //    this.fechaDevolucion = fechaDevolucion;
    //    this.empleado = new Empleado(nombre, dni,turno);
    //}
    
    //Agregacion
    public Alquiler(String fechaAlquiler, String fechaDevolucion, Empleado empleado){
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.empleado = empleado;
        this.peliculas = new ArrayList<Pelicula>();
    }
    @Override
    public String toString(){
        return "Fecha alquiler: " + fechaAlquiler + "Fecha devolucion" + fechaDevolucion;
    }
}
