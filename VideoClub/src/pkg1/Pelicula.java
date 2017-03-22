package pkg1;
public class Pelicula {
    private String nombre;
    private String genero;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public Pelicula(String nombre, String genero){
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "Genero" + genero;
    }
}
