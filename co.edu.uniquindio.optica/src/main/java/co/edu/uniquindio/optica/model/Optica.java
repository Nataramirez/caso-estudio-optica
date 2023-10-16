package co.edu.uniquindio.optica.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optica {
    public static List<Vendedor> listaVendedores = new ArrayList<>();
    public static List<Cliente> listaClientes = new ArrayList<>();

    public Optica(){}

    public static List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void setListaVendedores(List<Vendedor> listaVendedores) {
        Optica.listaVendedores = listaVendedores;
    }

    public static void setListaClientes(List<Cliente> listaClientes) {
        Optica.listaClientes = listaClientes;
    }

    /**
     * Método para determinar si un vendedor existe en la base de datos.
     * @param numeroId
     * @return boolean
     */
    public static boolean buscarVendedor(int numeroId) {
        int tamanioLista = getListaVendedores().size();
        boolean vendedorExiste = false;
        for(int i = 0; i < tamanioLista; i++){
            Vendedor vendedor = getListaVendedores().get(i);
            if(vendedor.getNumeroId()==numeroId){
                vendedorExiste = true;
                System.out.println("El vendedor con cédula " + numeroId + " sí existe");
                break;
            }
        }
        return vendedorExiste;
    }

    /**
     * Método para crear un vendedor
     * @param nombreCompleto
     * @param numeroId
     * @param salarioBasico
     * @return boolean
     */
    public static boolean crearVendedor(String nombreCompleto, int numeroId, double salarioBasico){
        if (!buscarVendedor(numeroId)) {
            Vendedor vendedor = new Vendedor(nombreCompleto, numeroId, salarioBasico);
            getListaVendedores().add(vendedor);
            return true;
        }else {
            return false;}
    }

    /**
     * Método para obtener listado de vendedores
     * @return listaVendedores
     */
    public static List<Vendedor> obtenerVendedores() {
        return getListaVendedores();
    }

    /**
     * Método para eliminar un vendedor de la lista
     * @param numeroId
     */
    public static boolean eliminarVendedor(int numeroId)
    {
        boolean vendedorEliminado = false;
        int tamanioLista = getListaVendedores().size();
        for(int i = 0; i < tamanioLista; i++){
            Vendedor vendedor = getListaVendedores().get(i);
            if(vendedor.getNumeroId()==numeroId){
                getListaVendedores().remove(i);
                vendedorEliminado = true;
                break;
            }
        }
        return vendedorEliminado;
    }

    /**
     * Método para actualizar los datos de un vendedor, a partir del numeroId.
     * @param numeroId
     * @return
     */
    public static Vendedor actualizarVendedor(int numeroId) {
        int tamanioLista = getListaVendedores().size();
        String nombreCompleto;
        double salarioBasico;
        Vendedor vendedorActualizado = null;
        for (int i = 0; i < tamanioLista; i++) {
            Vendedor vendedor = getListaVendedores().get(i);
            if (vendedor.getNumeroId()==numeroId) {
                Scanner teclado = new Scanner(System.in);
                System.out.print("Introduzca el nombre completo actualizado del vendedor: ");
                nombreCompleto = teclado.nextLine();
                vendedor.setNombreCompleto(nombreCompleto);
                System.out.print("Introduzca el número de identificación actualizado del vendedor: ");
                numeroId = teclado.nextInt();
                vendedor.setNumeroId(numeroId);
                System.out.print("Introduzca el salario básico actualizado del vendedor: ");
                salarioBasico = teclado.nextDouble();
                vendedor.setSalarioBasico(salarioBasico);
                vendedorActualizado = new Vendedor(nombreCompleto, numeroId, salarioBasico);
                break;
            } else
                System.out.println("El vendedor no se puede actualizar porque no existe.");
        }
        return vendedorActualizado;
    }

}
