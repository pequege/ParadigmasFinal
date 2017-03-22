/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14082015;
public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Alumno p2 = new Alumno();
        p1.nombre = "Luis";
        p1.setEdad(40);
        p2.nombre = "Rocio";
        p2.carrera = "ISI";
        p2.setEdad(-100);
        p1.nacimiento.setAño(1974);
        p1.saludar();
        p2.saludar(); 
        
    }
    
}
