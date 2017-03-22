
package ej14082015;

public class Alumno extends Persona {
    int legajo;
    String carrera;
    public void saludar(){
        System.out.print(
            "hola mi nombre es "+nombre);
        System.out.print(
            " mi legajo es "+legajo);
        System.out.println(
            " y curso "+carrera);       
    }
}
