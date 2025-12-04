public class Moto extends Vehiculo{
    private double cm2Cilindrada;

    public Moto(double valor, Duenio duenio, double cm2Cilindrada) {
        super(valor, duenio);
        this.cm2Cilindrada = cm2Cilindrada;
    }

    @Override
    protected double calcularImpuestoAutomotor() {
        return 150 + (0.05 * cm2Cilindrada);
    }

    public double getCm2Cilindrada() {
        return cm2Cilindrada;
    }

    @Override
    public String toString() {
        String infoVehiculo = super.toString();

        String infoMoto = String.format(", Centimetros cubicos de cilindrada: %.0f, Valor del impuesto aplicado: $%.2f]",
                cm2Cilindrada,
                calcularImpuestoAutomotor());

        return infoVehiculo.substring(0, infoVehiculo.length() - 1) + infoMoto;
    }

}
