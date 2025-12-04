import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDeArchivos {

    public List<Producto> cargarProductos(String ruta) {

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            List<Producto> productos = new ArrayList<>();

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split("\\s+");

                String nombre = partes[0];

                double precio = Double.parseDouble(partes[1]);

                productos.add(new Producto(nombre, precio));

            }

            return productos;

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return null;

    }
}