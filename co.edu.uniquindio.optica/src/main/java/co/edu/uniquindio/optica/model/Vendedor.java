package co.edu.uniquindio.optica.model;
import co.edu.uniquindio.optica.enums.MaterialMontura;
import co.edu.uniquindio.optica.enums.TipoFiltro;

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
    public double costoFiltro(TipoFiltro tipoFiltro){
        double precioFiltro = 0;
        switch (tipoFiltro){
            case ANTIREFLEJO:
                precioFiltro = 20000;
                break;
            case UV:
                precioFiltro = 40000;
                break;
            case HIDROFOBICO:
                precioFiltro = 80000;
                break;
            case COLORACION:
                precioFiltro = 160000;
                break;
            case ANTI_RAYAS:
                precioFiltro = 200000;
                break;
            case FOTOCROMATICO:
                precioFiltro = 300000;
                break;
            case POLARIZADO:
                precioFiltro = 350000;
                break;
            case ESPEJADO:
                precioFiltro = 450000;
                break;
            default:
                break;
        }
        return precioFiltro;
    }
    /*
    public double costoTotalVenta(Cliente cliente){
        double costoFiltroCliente = costoFiltro(cliente.getTipoFiltro());
        double costoMonturaCliente = costoMontura(cliente.getMaterialMontura());
        double costoDiagnosticoCliente = cliente.getDiagnostico().getPrecio();
        double costoGradoCliente = cliente.getGrado().getPrecio();
        return costoFiltroCliente + costoMonturaCliente + costoDiagnosticoCliente + costoGradoCliente;
    }

     */
    public double comisionVentas(double costoVenta1, double costoVenta2, double costoVenta3, double costoVenta4, double costoVenta5){
        double comision = (costoVenta1 + costoVenta2 + costoVenta3 + costoVenta4 + costoVenta5)*0.1;
        return comision;
    }
    public double salarioTotal(double salarioBasico, double comisionVentas){
        double salarioTotal = salarioBasico + comisionVentas;
        return  salarioTotal;
    }


}
