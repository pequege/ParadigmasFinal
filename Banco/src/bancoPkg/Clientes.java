package bancoPkg;
public class Clientes {
    private String nombre;
    private CuentaCorriente cuentaCorriente;
    private CajaAhorros cajaAhorros;
        
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public CuentaCorriente getCuentaCorriente(){
        return cuentaCorriente;
    }
    
    public CajaAhorros getCajaAhorros(){
        return cajaAhorros;
    }

    public void setCajaAhorros(CajaAhorros cajaAhorros) {
        this.cajaAhorros = cajaAhorros;
    }
    
    public void setCuentaCorriente(CuentaCorriente cuentaCorriente){
        this.cuentaCorriente = cuentaCorriente;
    }
    
    public Clientes (String nombre, CajaAhorros cajaAhorros, CuentaCorriente cuentaCorriente){
        this.nombre = nombre;
        this.cajaAhorros = cajaAhorros;
        this.cuentaCorriente = cuentaCorriente;
    }
    
    @Override
    public String toString(){
        return String.valueOf(nombre) + "\t Saldo: " + String.valueOf(cajaAhorros.getSaldo());
    }
}
