package inventario;

import inventario.model.Producto;

public class App {


    public static void main(String[] args) {

        Producto producto1 = new Producto("2", "Producto 1", 10.5, 5);

        producto1.mostrarProducto();

    }
}
