package modelo;

public enum TipoDeVehiculo {
    AUTOMOVIL(20,100),CAMIONETA(25,160),MOTOCICLETA(15,60);
    
    private int precioEstadia;
    private int precioLavado;
    
    TipoDeVehiculo(int precioEstadia,int precioLavado){
    this.precioEstadia = precioEstadia;
    this.precioLavado = precioLavado;
    }

    public int getPrecioLavado(){
        return precioLavado;
    }
    public int getPrecioEstadia(){
        return precioEstadia;
    }
}
