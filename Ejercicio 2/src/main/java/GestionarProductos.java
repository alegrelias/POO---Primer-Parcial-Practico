import java.util.List;

public class GestionarProductos {
    String ruta;

    public GestionarProductos(String ruta) {
        this.ruta = ruta;
    }

    public double calcularPromedio(){

        GestorDeArchivos gestor = new GestorDeArchivos();

        List<Producto> productosDelArchivo = gestor.cargarProductos(ruta);

        double suma = 0;

        for (Producto producto : productosDelArchivo){
            suma += producto.getPrecio();
        }

        return suma / productosDelArchivo.size();

    }

    public double calcularTotal(){

        GestorDeArchivos gestor = new GestorDeArchivos();

        List<Producto> productosDelArchivo = gestor.cargarProductos(ruta);

        double suma = 0;

        for (Producto producto : productosDelArchivo){
            suma += producto.getPrecio();
        }

        return suma;

    }

}
