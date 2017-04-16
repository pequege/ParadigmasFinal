package modelo;
public class Servicio {
    private Mantenimiento m = new Mantenimiento(false);
    private Lavado l = new Lavado(false);
    private Estadia e = new Estadia();

    public Mantenimiento getM() {
        return m;
    }

    public void setM(Mantenimiento m) {
        this.m = m;
    }

    public Lavado getL() {
        return l;
    }

    public void setL(Lavado l) {
        this.l = l;
    }

    public Estadia getE() {
        return e;
    }

    public void setE(Estadia e) {
        this.e = e;
    }
    
    public Servicio(){
    }
}
