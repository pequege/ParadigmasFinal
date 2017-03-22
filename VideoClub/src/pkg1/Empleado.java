/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author pequege
 */
public class Empleado extends Persona{
    private String turno;

    public Empleado(String nombre, String dni, String turno) {
        super(nombre, dni);
        this.turno = turno;
    }
    
    public String getTurno(){
        return turno;
    }
    
    public void setTurno(){
        this.turno = turno;
    }
    
    @Override
    public String toString(){
        return "..";
    }
}
