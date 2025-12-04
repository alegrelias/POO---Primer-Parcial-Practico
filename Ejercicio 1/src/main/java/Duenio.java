public class Duenio extends Persona{
    public Duenio(String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public String toString() {
        return "Duenio:\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "DNI: " + dni + "\n";
    }
}
