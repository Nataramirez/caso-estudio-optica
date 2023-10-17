package co.edu.uniquindio.optica.model;
import co.edu.uniquindio.optica.enums.Diagnostico;
import co.edu.uniquindio.optica.enums.Grado;
import co.edu.uniquindio.optica.enums.MaterialMontura;
import co.edu.uniquindio.optica.enums.TipoFiltro;

public class Cliente {
    private String nombreCompleto;
    private Long numeroContacto;
    private Integer edad;
    private int numeroId;
    private String correo;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, long numeroContacto, Integer edad, int numeroId, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.numeroContacto = numeroContacto;
        this.edad = edad;
        this.numeroId = numeroId;
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Long getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(Long numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroContacto=" + numeroContacto +
                ", edad=" + edad +
                ", numeroId=" + numeroId +
                ", correo='" + correo + '\'' +
                '}';
    }
}


