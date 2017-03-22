package pkg1;
public class Persona {
    private String nombre;
    private String dni;

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //sobrecarga
    public void setNombre(Double nombre){
        this.nombre = nombre.toString();
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public Persona(String nombre, String dni){
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
        this.dni = "0";
    }
    
    @Override
    public String toString(){
        return "Nombre:" + getNombre() + " Dni: " + dni;
    }
}
