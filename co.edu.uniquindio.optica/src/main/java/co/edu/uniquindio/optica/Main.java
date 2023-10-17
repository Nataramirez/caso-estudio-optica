package co.edu.uniquindio.optica;
import co.edu.uniquindio.optica.model.Cliente;
import co.edu.uniquindio.optica.model.Optica;
import co.edu.uniquindio.optica.model.Vendedor;
import co.edu.uniquindio.optica.model.EntradaConsola;
import co.edu.uniquindio.optica.enums.Crud;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Optica optica = inicializarDatosPrueba();

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
        crearVendedor("Nicolás Upegui", 1098, 1200000, optica);
        crearVendedor("Jerónimo Osorio", 1099, 1200000, optica);
        crearVendedor("Augusto Álvarez", 1001, 1200000, optica);
        crearVendedor("Camilo Marulanda", 1002, 1200000, optica);
        Vendedor vendedor = new Vendedor("Gerardo Lopez", 1095305816, 1300000);
        /*double costoventa1 = vendedor.costoTotalVenta(cliente1);
        double costoventa2 = vendedor.costoTotalVenta(cliente2);
        double costoventa3 = vendedor.costoTotalVenta(cliente3);
        double costoventa4 = vendedor.costoTotalVenta(cliente4);
        double costoventa5 = vendedor.costoTotalVenta(cliente5);
        double comision = vendedor.comisionVentas(costoventa1, costoventa2, costoventa3, costoventa4, costoventa5);
        double salarioVendedor = vendedor.salarioTotal(vendedor.getSalarioBasico(), comision);
        */

        System.out.println("\n--------> Lista de vendedores <-------\n");
        mostrarInformacionVendedores(optica);
        eliminarVendedor(optica, 1098);
        actualizarVendedor(optica, 1001);
        System.out.println("\n--------> Lista de vendedores después de eliminar y actualizar <-------\n");
        mostrarInformacionVendedores(optica);

        /*
        codigo para ejecutar la aplicación
        int ejecutarAplicacion = 1;
        while (ejecutarAplicacion == 1){
            String tipoProceso = EntradaConsola.tipoProceso();
            ejecutarAplicacion = EntradaConsola.cerrarApliacionString(tipoProceso);
            if(tipoProceso != null){
                String tipoCrud = EntradaConsola.tipoCrud(tipoProceso);
                ejecutarAplicacion = EntradaConsola.cerrarApliacionString(tipoCrud);
                if(tipoCrud != null){
                    ejecutarAplicacion = ejecutarCrud(tipoProceso, tipoCrud);
                }
            }
        }*/
    }

    /**
     * Método para llamar el tipo de CRUD de acuerdo al proceso
     * @param proceso
     * @param crud
     * @return
     */
    private static int ejecutarCrud(String proceso, String crud){
        int cerrarAplicacion = 1;
        if(crud.contains(Crud.CREATE.getNombre())){
            cerrarAplicacion = EntradaConsola.crear(proceso);
        }
        if(crud.contains(Crud.READ.getNombre())){
            cerrarAplicacion = EntradaConsola.leer(proceso);
        }
        if(crud.contains(Crud.DELETE.getNombre())){
            cerrarAplicacion = EntradaConsola.eliminar(proceso);
        }
        if(crud.contains(Crud.UPDATE.getNombre())){
            cerrarAplicacion = EntradaConsola.actualizar(proceso);
        }

        return cerrarAplicacion;
    }

    /**
     * Método de para crear vendedor
     * @param nombreComplero
     * @param numeroId
     * @param salarioBasico
     */
    private static void crearVendedor(String nombreComplero,
                                    int numeroId,
                                    double salarioBasico,
                                    Optica optica) {
        optica.crearVendedor(nombreComplero, numeroId, salarioBasico);
    }

    /**
     * Método para emiliar un vendedor
     * @param optica
     * @param numeroId
     */
    private static void eliminarVendedor(Optica optica, int numeroId) {
        optica.eliminarVendedor(numeroId);
    }

    /**
     * Método para actualizar datos de un vendedor, a partir de la cédula.
     * @param optica
     * @param numeroId
     */
    private static void actualizarVendedor(Optica optica, int numeroId) {
        optica.actualizarVendedor(numeroId);
    }

    /**
     * Método para mostrar información de vendedores
     * @param optica
     */
    private static void mostrarInformacionVendedores(Optica optica) {
        List<Vendedor> listaVendedores = optica.obtenerVendedores();
        int tamanioLista = listaVendedores.size();
        for(int i = 0; i < tamanioLista; i++){
            Vendedor vendedor = listaVendedores.get(i);
            System.out.println(vendedor.toString());
        }
    }

    /**
     * Método para inicializar datos prueba.
     * @return
     */
    private static Optica inicializarDatosPrueba() {
        Optica optica = new Optica();
        return optica;
    }


}