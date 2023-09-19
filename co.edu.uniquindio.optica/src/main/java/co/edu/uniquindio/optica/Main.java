package co.edu.uniquindio.optica;
import co.edu.uniquindio.optica.enums.Diagnostico;
import co.edu.uniquindio.optica.enums.Grado;
import co.edu.uniquindio.optica.enums.MaterialMontura;
import co.edu.uniquindio.optica.enums.TipoFiltro;
import co.edu.uniquindio.optica.model.Cliente;
import co.edu.uniquindio.optica.model.Vendedor;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente("Cecilia Perez",1206254846,70,
                1044965315, Grado.GRADO_575, Diagnostico.MIOPIA, MaterialMontura.TITANIO, TipoFiltro.ANTIREFLEJO);
        Cliente cliente2 = new Cliente("Víctor Romero",1238070113,55,
                1163837233,Grado.GRADO_150,Diagnostico.ASTIGMATISMO,MaterialMontura.ALUMINIO,TipoFiltro.FOTOCROMATICO);
        Cliente cliente3 = new Cliente("Oscar Flores",1212647432,
                67,1110324914,Grado.GRADO_175,Diagnostico.MIOPIA,MaterialMontura.ACERO_INOXIDABLE,TipoFiltro.FOTOCROMATICO);
        Cliente cliente4 = new Cliente("Nicolás Alvarez",1236897833,
                32,1138113441,Grado.GRADO_450,Diagnostico.MIOPIA,MaterialMontura.ALUMINIO,TipoFiltro.ANTIREFLEJO);
        Cliente cliente5 = new Cliente("Martín Herrera",1230481593,
                14,1111507810,Grado.GRADO_325,Diagnostico.ASTIGMATISMO,MaterialMontura.ALUMINIO,TipoFiltro.FOTOCROMATICO);
        Vendedor vendedor = new Vendedor("Gerardo Lopez", 1095305816, 1300000);
        double costoventa1 = vendedor.costoTotalVenta(cliente1);
        double costoventa2 = vendedor.costoTotalVenta(cliente2);
        double costoventa3 = vendedor.costoTotalVenta(cliente3);
        double costoventa4 = vendedor.costoTotalVenta(cliente4);
        double costoventa5 = vendedor.costoTotalVenta(cliente5);
        double comision = vendedor.comisionVentas(costoventa1, costoventa2, costoventa3, costoventa4, costoventa5);
        double salarioVendedor = vendedor.salarioTotal(vendedor.getSalarioBasico(), comision);
    }

}