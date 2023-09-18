package co.edu.uniquindio.optica.model;
import co.edu.uniquindio.optica.enums.Diagnostico;
import co.edu.uniquindio.optica.enums.MaterialMontura;
import co.edu.uniquindio.optica.enums.TipoFiltro;

public class Cliente
{
    private String nombreCompleto;
    private int numeroContacto;
    private int edad;
    private int numeroId;
    private double grado;
    private Diagnostico diagnostico;
    private MaterialMontura materialMontura;
    private TipoFiltro tipoFiltro;

    public Cliente(){}

    public Cliente(String nombreCompleto, int numeroContacto, int edad, int numeroId, double grado,
                   Diagnostico diagnostico, MaterialMontura materialMontura, TipoFiltro tipoFiltro)
    {
        this.nombreCompleto = nombreCompleto;
        this.numeroContacto = numeroContacto;
        this.edad = edad;
        this.numeroId = numeroId;
        this.grado = grado;
        this.diagnostico = diagnostico;
        this.materialMontura = materialMontura;
        this.tipoFiltro = tipoFiltro;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public double getGrado() {
        return grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public MaterialMontura getMaterialMontura() {
        return materialMontura;
    }

    public void setMaterialMontura(MaterialMontura materialMontura) {
        this.materialMontura = materialMontura;
    }

    public TipoFiltro getTipoFiltro() {
        return tipoFiltro;
    }

    public void setTipoFiltro(TipoFiltro tipoFiltro) {
        this.tipoFiltro = tipoFiltro;
    }
}
