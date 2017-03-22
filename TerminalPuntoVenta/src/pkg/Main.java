package pkg;
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Coke", 56421, 34.99);
        Producto p2 = new Producto("Pizza", 56410, 79.99);
        Producto p3 = new Producto("Milanesa", 54200, 64.99);
        
        LineaVenta lv1 = new LineaVenta(2, p1);
        LineaVenta lv2 = new LineaVenta(2, p2);
        LineaVenta lv3 = new LineaVenta(3, p3);
        
        Venta v3 = new Venta();
        v3.addLinea(lv2);
        v3.addLinea(lv1);
        v3.addLinea(lv3);
        v3.mostrarLineas();
    }
    
}
