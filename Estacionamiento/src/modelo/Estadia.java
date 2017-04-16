package modelo;

import java.util.Date;

public class Estadia {
    private Lugar lugar;
    private String ingreso;
    private Date egreso;

    public Lugar getLugares() {
        return lugar;
    }

    public void setLugares(Lugar lugar) {
        this.lugar = lugar;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public Date getEgreso() {
        return egreso;
    }

    public void setEgreso(Date egreso) {
        this.egreso = egreso;
    }
    
}
