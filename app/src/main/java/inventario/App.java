package inventario;

import inventario.model.Producto;

public class App {


    public static void main(String[] args) {

        Producto producto1 = new Producto("2", "Producto 1", 10.5, 5);
        Producto producto2 = new Producto("3", "Producto 2", 20.0, 3);
        Producto producto3 = new Producto("4", "Producto 3", 23.0, 3);

        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto3.mostrarProducto();

        // String nombreProducto = producto2.getNombre();

        // System.out.println("Nombre del producto 2: " + nombreProducto);
        // System.out.println("Nombre del producto 3: " + producto3.getNombre());
    }
}
