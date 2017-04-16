package bancoPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Banco{
    private ArrayList<Clientes> clientes = new ArrayList<>();
    
    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public Banco() {
    }
        
    //Metodos
    public void addCli(Clientes cliente){
        clientes.add(cliente);
    }
    
    public void ordenAB(){
        //orden alfabetico
        Collections.sort(clientes, new Comparator<Clientes>() {
        @Override
        public int compare(Clientes z1, Clientes z2) {
          if (Integer.parseInt(z1.getNombre()) > Integer.parseInt(z2.getNombre()))
            return 1;
          if (Integer.parseInt(z1.getNombre()) < Integer.parseInt(z2.getNombre()))
            return -1;
          return 0;
          }
        });
    }
    
    public void listarClienteAlf(){
        for(Clientes cliente: clientes){
            System.out.println(cliente.toString());   
        }
    }
    
    public float CalcularDineroEnELBanco(){
        return 2;
    }
}
