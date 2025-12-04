import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GestorVehiculos {
    private List<Vehiculo> vehiculos;

    public GestorVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        System.out.println("\nSe ha agregado a la flota el vehiculo: " + vehiculo);
    }

    public void eliminarVehiculo(Duenio duenio){

        Optional<Vehiculo> auxiliar = vehiculos.stream()
                .filter(vehiculo -> duenio.equals(vehiculo.getDuenio()))
                .findFirst();

        if(auxiliar.isPresent()){
            Vehiculo vehiculoA_Eliminar = auxiliar.get();

            vehiculos.remove(vehiculoA_Eliminar);

            System.out.println("Se ha eliminado el vehiculo: " + vehiculoA_Eliminar);

        }
    }

    public void mostrarFlota(){
        vehiculos.sort(Comparator.comparing(Vehiculo::getValor));
        vehiculos.forEach(vehiculo -> System.out.println(vehiculo + "\nImpuesto automotor: " + vehiculo.calcularImpuestoAutomotor()));
    }

}
