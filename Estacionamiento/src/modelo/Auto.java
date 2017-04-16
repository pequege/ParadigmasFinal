package modelo;
public class Auto extends Vehiculo{
    private int especifico;

    public String getEspecifico() {
        return String.valueOf(especifico);
    }

    public void setPuertas(int especifico) {
        this.especifico = especifico;
    } 
    
    public Auto(){
        
    }
}
