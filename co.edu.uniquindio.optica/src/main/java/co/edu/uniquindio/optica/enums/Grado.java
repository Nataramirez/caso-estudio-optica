package co.edu.uniquindio.optica.enums;

public enum Grado {
    GRADO_025(5000), GRADO_050(10000), GRADO_075(15000), GRADO_100(20000),
    GRADO_125(25000), GRADO_150(30000), GRADO_175(35000), GRADO_200(40000),
    GRADO_225(45000), GRADO_250(50000), GRADO_275(55000), GRADO_300(60000),
    GRADO_325(65000), GRADO_350(70000), GRADO_375(75000), GRADO_400(80000),
    GRADO_425(85000), GRADO_450(90000), GRADO_475(95000), GRADO_500(100000),
    GRADO_525(105000), GRADO_550(110000), GRADO_575(115000), GRADO_600(120000);

    private double precio;

    Grado(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
