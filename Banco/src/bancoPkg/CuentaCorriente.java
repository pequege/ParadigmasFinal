package bancoPkg;
public class CuentaCorriente extends Cuenta{
    private Double interesMensual;
    
    public Double getInteresMensual(){
        return interesMensual;
    }
    
    public void setInteresMensual(Double interesMensual){
        this.interesMensual = interesMensual;
    }

    public CuentaCorriente(Double interesMensual, Double saldo) {
        super(saldo);
        this.interesMensual = interesMensual;
    }
    
    @Override
    public void extraer(Double monto){
        Double saldoActual = super.getSaldo() - monto;
        super.setSaldo(saldoActual);
    }
}
