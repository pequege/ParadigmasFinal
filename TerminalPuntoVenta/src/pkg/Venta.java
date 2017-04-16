package pkg;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Venta {
    private final String fecha;
    private ArrayList<LineaVenta> lineasVenta;
    
    public String getFecha(){
        return fecha;
    }
    
    public ArrayList<LineaVenta> getLineasVenta(){
        return lineasVenta;
    }
    
    public void setLineaVenta(ArrayList<LineaVenta> lineasVenta){
        this.lineasVenta = lineasVenta;
    }
    
    public void addLinea(LineaVenta lineaVenta){
        lineasVenta.add(lineaVenta);
    }
    
    public double getTotal(){
        double a = 0;
        for(LineaVenta l:lineasVenta){
            a = l.getSubTotal() + a;
        }
        return Math.rint(a*100)/100;
    }
    
    public void mostrarLineas(){
        System.out.println("Fecha: " + fecha);
        for(LineaVenta l: lineasVenta){
            System.out.println(l.toString());
        }
        System.out.println("--------------------------------------------------");
        //return Math.rint((producto.getPrecio() * cantidad)*100)/100;
        System.out.println("TOTAL ...........$" + getTotal());
    }
    //Composicion
    //public Alquiler(String fechaAlquiler, String fechaDevolucion, String nombre, String dni, String turno){
    //    this.fechaAlquiler = fechaAlquiler;
    //    this.fechaDevolucion = fechaDevolucion;
    //    this.empleado = new Empleado(nombre, dni,turno);
    //}
    public Venta(){
        //http://stackoverflow.com/questions/23068676/how-to-get-current-timestamp-in-string-format-in-java-yyyy-mm-dd-hh-mm-ss
        this.fecha  = new SimpleDateFormat("dd/MM/yy HH:mm:ss").format(new java.util.Date());
        this.lineasVenta = new ArrayList<LineaVenta>();
    }
}
