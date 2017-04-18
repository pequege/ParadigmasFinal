package modelo;

import java.util.Date;

public class Estadia {
    private Lugar lugar;
    private int ingreso;
    private int egreso;

    public Lugar getLugares() {
        return lugar;
    }

    public void setLugares(Lugar lugar) {
        this.lugar = lugar;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getEgreso() {
        return egreso;
    }

    public void setEgreso(int egreso) {
        this.egreso = egreso;
    }
    
}
