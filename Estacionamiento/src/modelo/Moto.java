package modelo;
public class Moto extends Vehiculo{
    private int especifico;

    public String getEspecifico(){
        return String.valueOf(especifico);
    }

    public void setCilindrado(int especifico) {
        this.especifico = especifico;
    }
    
    public Moto(){
    }
}
