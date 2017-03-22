package pkg;
public class LineaVenta {
    private int cantidad;
    private Producto producto;
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public Producto getProducto(){
        return producto;
    }
    
    public void setProducto(Producto producto){
        this.producto = producto;
    }
    
    public LineaVenta(int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }
    
    public double getSubTotal(){
        return Math.rint((producto.getPrecio() * cantidad)*100)/100;
        //rint redondea
        //choreado de https://javafox.wordpress.com/2009/10/20/redondear-un-double-en-java/
    }
    
    @Override
    public String toString(){
        return String.valueOf(producto)+ "(X" + cantidad + ")" + "...........$" + getSubTotal();
    }
}
