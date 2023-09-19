package co.edu.uniquindio.optica.enums;

public enum Diagnostico {
    MIOPIA(150000), ASTIGMATISMO(100000);
    private double precio;

    Diagnostico(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
