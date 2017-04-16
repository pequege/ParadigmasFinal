package bancoPkg;
public class Cuenta {
    private Double saldo;
    
    public Double getSaldo(){
        return saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    //constructor
    public Cuenta(Double saldo){
        this.saldo = saldo;
    }
    public Cuenta(){
    }
    //metodos
    public void depositar(Double monto){
        
    }
    public void extraer(Double monto){
        
    }
    public void transferir(String cuentaDestino, Double monto){
        
    }
}
