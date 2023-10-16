package co.edu.uniquindio.optica;
import co.edu.uniquindio.optica.model.Cliente;
import co.edu.uniquindio.optica.model.Vendedor;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente("Cecilia Perez",1206254846,70,
                1044965315, "cecilia@mail.com");
        Cliente cliente2 = new Cliente("Víctor Romero",1238070113,55,
                1163837233,"victor@mail.com");
        Cliente cliente3 = new Cliente("Oscar Flores",1212647432,
                67,1110324914, "oscar@mail.com");
        Cliente cliente4 = new Cliente("Nicolás Alvarez",1236897833,
                32,1138113441, "nicolas@mail.com");
        Cliente cliente5 = new Cliente("Martín Herrera",1230481593,
                14,1111507810, "martin@mail.com");
        Vendedor vendedor = new Vendedor("Gerardo Lopez", 1095305816, 1300000);
        /*double costoventa1 = vendedor.costoTotalVenta(cliente1);
        double costoventa2 = vendedor.costoTotalVenta(cliente2);
        double costoventa3 = vendedor.costoTotalVenta(cliente3);
        double costoventa4 = vendedor.costoTotalVenta(cliente4);
        double costoventa5 = vendedor.costoTotalVenta(cliente5);
        double comision = vendedor.comisionVentas(costoventa1, costoventa2, costoventa3, costoventa4, costoventa5);
        double salarioVendedor = vendedor.salarioTotal(vendedor.getSalarioBasico(), comision);*/
    }

}