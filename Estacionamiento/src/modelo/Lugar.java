package modelo;
public class Lugar {
    private int numero;
    private boolean es_techado;
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEs_techado() {
        return es_techado;
    }

    public void setEs_techado(boolean es_techado) {
        this.es_techado = es_techado;
    }

    public Lugar() {
    }
}
