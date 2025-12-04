public class Auto extends Vehiculo{
    private String color;

    public Auto(double valor, Duenio duenio, String color) {
        super(valor, duenio);
        this.color = color;
    }

    @Override
    protected double calcularImpuestoAutomotor() {
        return valor * 0.05;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String infoVehiculo = super.toString();

        String infoAuto = String.format(", Color: %s, Valor del impuesto aplicado: $%.2f]",
                color,
                calcularImpuestoAutomotor());

        return infoVehiculo.substring(0, infoVehiculo.length() - 1) + infoAuto;
    }


}
