package co.edu.uniquindio.optica.model;
import co.edu.uniquindio.optica.enums.MaterialMontura;

public class Vendedor
{
    private String nombreCompleto;
    private int numeroId;
    private double salarioBasico;

    public Vendedor() {}

    public Vendedor(String nombreCompleto, int numeroId, double salarioBasico, double comisiones)
    {
        this.nombreCompleto = nombreCompleto;
        this.numeroId = numeroId;
        this.salarioBasico = salarioBasico;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double costoMontura(MaterialMontura tipoMontura){
        double precioMontura = 0;
        switch (tipoMontura){
            case TITANIO:
                precioMontura = 200000;
                break;
            case ACERO_INOXIDABLE:
                precioMontura = 50000;
                break;
            case ACETATO:
                precioMontura = 12500;
                break;
            case ALUMINIO:
                precioMontura = 100000;
                break;
            case PLASTICO:
                precioMontura = 25000;
            default:
                break;
        }
        return precioMontura;
    }
}
