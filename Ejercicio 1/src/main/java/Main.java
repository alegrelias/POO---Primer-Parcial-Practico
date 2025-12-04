public class Main {
    public static void main(String[] args) {

        GestorVehiculos gestor = new GestorVehiculos();

        gestor.agregarVehiculo(new Auto(50000, new Duenio("Martin", "Villareal", 12345678L), "Rojo"));
        gestor.agregarVehiculo(new Moto(80000, new Duenio("Ariel", "Parson", 87654321L), 80));
        gestor.agregarVehiculo(new Auto(50000, new Duenio("Elias", "Alegre", 47933974L), "Negro"));

        gestor.mostrarFlota();

        gestor.eliminarVehiculo(new Duenio("Elias", "Alegre", 47933974L));

        gestor.mostrarFlota();

    }
}
