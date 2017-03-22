package ej14082015;

public class Persona {
    String nombre;
    Fecha nacimiento = new Fecha();
    
    private int edad;
    
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int e){
        if (e <0 || e >100){
            System.out.println("Error Edad");
            edad = 18;
        }
        else {
            edad = e;
        }
    }
    
    public void saludar(){
        System.out.print("hola mi nombre es "+nombre);
        System.out.print(". Naci el " + nacimiento);
        System.out.println(". Mi edad es : "+edad);
        
    }
    
}
