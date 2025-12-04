public class Main {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\Usuario\\IdeaProjects\\POO\\POO - ejemplos de parciales\\POO - Primer Parcial Practico - Elias Nahuel Alegre\\POO-PrimerParcial-ej2\\src\\main\\java\\inventario";

        GestionarProductos gestor = new GestionarProductos(ruta);

        System.out.println("El promedio de los productos del invetario es igual a: " + gestor.calcularPromedio());

        System.out.println("El precio total de los productos del inventario es igual a: " + gestor.calcularTotal());

    }
}
