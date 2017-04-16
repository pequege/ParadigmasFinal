package modelo;
public class Camioneta extends Vehiculo{
    private String especifico;

    @Override
    public String getEspecifico() {
        return especifico;
    }

    public void setCabina(String especifico) {
        this.especifico = especifico;
    }

    public Camioneta() {
    }
    
}
