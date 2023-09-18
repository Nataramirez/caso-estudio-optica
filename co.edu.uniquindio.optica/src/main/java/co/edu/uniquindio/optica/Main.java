package co.edu.uniquindio.optica;
import co.edu.uniquindio.optica.enums.Diagnostico;
import co.edu.uniquindio.optica.enums.MaterialMontura;
import co.edu.uniquindio.optica.enums.TipoFiltro;
import co.edu.uniquindio.optica.model.Cliente;
import co.edu.uniquindio.optica.model.Vendedor;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente("Cecilia Perez",1206254846,70,
                1044965315,5.75, Diagnostico.MIOPIA, MaterialMontura.TITANIO, TipoFiltro.ANTIREFLEJO);
        Cliente cliente2 = new Cliente("Víctor Romero",1238070113,55,
                1163837233,1.50,Diagnostico.ASTIGMATISMO,MaterialMontura.ALUMINIO,TipoFiltro.FOTOCROMATICO);
        Cliente cliente3 = new Cliente("Oscar Flores",1212647432,
                67,1110324914,1.75,Diagnostico.MIOPIA,MaterialMontura.ACERO_INOXIDABLE,TipoFiltro.FOTOCROMATICO);
        Cliente cliente4 = new Cliente("Nicolás Alvarez",1236897833,
                32,1138113441,4.50,Diagnostico.MIOPIA,MaterialMontura.ALUMINIO,TipoFiltro.ANTIREFLEJO);
        Cliente cliente5 = new Cliente("Martín Herrera",1230481593,
                14,1111507810,3.25,Diagnostico.ASTIGMATISMO,MaterialMontura.ALUMINIO,TipoFiltro.FOTOCROMATICO);
        Vendedor vendedor = new Vendedor("Gerardo Lopez", 1095305816, 1300000);
    }

}