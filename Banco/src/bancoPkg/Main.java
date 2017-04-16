package bancoPkg;
public class Main {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente(0.1, 2540.0);
        CajaAhorros c2 = new CajaAhorros(2015.0);
    
        Clientes cl1 = new Clientes("John Cena", c2, c1);
        Clientes cl2 = new Clientes("Dj Khaled", c2, c1);
        Clientes cl3 = new Clientes("Kendrick Lamar", c2, c1);
    
        Banco n1 = new Banco();
        
        n1.addCli(cl1);
        n1.addCli(cl2);
        n1.addCli(cl3);
        
        n1.listarClienteAlf();
    }
}
