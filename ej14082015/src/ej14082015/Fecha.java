
package ej14082015;
public class Fecha {
    private int dia = 1;
    private int mes = 1;
    private int año = 1990;
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String toString(){
        return dia + "/" + mes + "/" + año;
    }
}
