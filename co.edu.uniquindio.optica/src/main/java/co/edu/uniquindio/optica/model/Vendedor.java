package co.edu.uniquindio.optica.model;

public class Vendedor
{
    private String nombreCompleto;
    private int numeroId;
    private double salarioBasico;

    public Vendedor() {}

    public Vendedor(String nombreCompleto, int numeroId, double salarioBasico)
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
}
