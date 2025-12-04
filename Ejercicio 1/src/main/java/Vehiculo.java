public abstract class Vehiculo {
    protected double valor;
    protected Duenio duenio;


    public Vehiculo(double valor, Duenio duenio) {
        this.valor = valor;
        this.duenio = duenio;
    }

    protected abstract double calcularImpuestoAutomotor();

    public double getValor() {
        return valor;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    @Override
    public String toString() {
        return String.format("\nVehiculo [Valor: $%s, Duenio: %s]",
                valor, duenio);
    }

}
