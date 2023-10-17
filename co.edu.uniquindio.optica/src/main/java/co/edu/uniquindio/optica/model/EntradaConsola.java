package co.edu.uniquindio.optica.model;
import co.edu.uniquindio.optica.enums.Proceso;
import co.edu.uniquindio.optica.enums.Crud;

import javax.swing.*;
import java.util.List;

public class EntradaConsola {
    /**
     * Método para seleccionar el tipo de proceso que desea gestionar el usuario
     * @return
     */
    public static String tipoProceso(){
        String proceso = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el proceso que desea gestionar",
                "PROCESO", JOptionPane.DEFAULT_OPTION,
                null,
                Proceso.proceso(),
                null);
        return proceso;
    }

    /**
     * Método para validar input de tipo String por consola
     * @param accion
     * @return
     */
    public static int cerrarApliacionString(String accion){
        int cerrar = 1;
        if(accion instanceof String){
            return cerrar;
        }else {
            int respuestaCerrar = JOptionPane.showConfirmDialog(null,
                    "¿Desea cerrar la aplicación?",
                    "Alerta!",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.ERROR_MESSAGE);
            cerrar = respuestaCerrar;
            return cerrar;
        }
    }

    /**
     * Método para validar input de tipo Integer por consola
     * @param dato
     * @return
     */
    public static int cerrarApliacionInt(Integer dato){
        int cerrar = 1;
        if(dato instanceof Integer){
            return cerrar;
        }else {
            int respuestaCerrar = JOptionPane.showConfirmDialog(null,
                    "¿Desea cerrar la aplicación?",
                    "Alerta!",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.ERROR_MESSAGE);
            cerrar = respuestaCerrar;
            return cerrar;
        }
    }

    /**
     * Método para validar el input de tipo Long por consola
     * @param dato
     * @return
     */
    public static int cerrarAplicacionLong(Long dato){
        int cerrar = 1;
        if(dato instanceof Long){
            return cerrar;
        }else {
            int respuestaCerrar = JOptionPane.showConfirmDialog(null,
                    "¿Desea cerrar la aplicación?",
                    "Alerta!",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.ERROR_MESSAGE);
            cerrar = respuestaCerrar;
            return cerrar;
        }
    }

    /**
     * Método para cerrar la aplicación
     * @return
     */
    public static int cerrarAplicacion(){
        int respuestaCerrar = JOptionPane.showConfirmDialog(null,
                "¿Desea cerrar la aplicación?",
                "Alerta!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE);
        System.out.println(respuestaCerrar + " respuesta para cerrar");
        return respuestaCerrar;
    }

    /**
     * Método para el tipo de acción a ejecutar, CREAR, LEER, ACTUALIZAR O ELIMINAR
     * @param proceso
     * @return
     */
    public static String tipoCrud(String proceso){
        String resp = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una acción a ejecutar",
                "CRUD", JOptionPane.DEFAULT_OPTION,
                null,
                Crud.crud(proceso),
                null);
        return resp;
    }

    /**
     * Método para crear de acuerdo al proceso seleccionado
     * @param proceso
     * @return
     */
    public static int crear(String proceso){
        int cerrar = 1;
        if(proceso.equals(Proceso.CLIENTE.getNombre())){
            while(cerrar == 1){
                String nombre = JOptionPane.showInputDialog("Ingrese nombre completo del cliente");
                int cerrarAplicacionEnNombre = cerrarApliacionString(nombre);
                if(cerrarAplicacionEnNombre == 0){
                    cerrar = cerrarAplicacionEnNombre;
                    return cerrar;
                } else if (cerrarAplicacionEnNombre == 1 && nombre == null) {
                    nombre = JOptionPane.showInputDialog("Ingrese nombre completo del cliente");
                    cerrarAplicacionEnNombre = cerrarApliacionString(nombre);
                }
                Long numeroContacto = Long.parseLong(JOptionPane.showInputDialog("Ingrese número de contacto del cliente"));
                if(numeroContacto == null){
                    numeroContacto = Long.parseLong(JOptionPane.showInputDialog("Ingrese números para el contacto del cliente"));
                }
                int cerrarAplicacionNumeroContacto = cerrarAplicacionLong(numeroContacto);
                if(cerrarAplicacionNumeroContacto == 0){
                    cerrar = cerrarAplicacionNumeroContacto;
                    return cerrar;
                } else if (cerrarAplicacionNumeroContacto == 1 && numeroContacto == null) {
                    numeroContacto = Long.parseLong(JOptionPane.showInputDialog("Ingrese número de contacto del cliente"));
                    cerrarAplicacionNumeroContacto = cerrarAplicacionLong(numeroContacto);
                }
                Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del cliente"));
                if(edad == null){
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para la edad del cliente"));
                }
                int cerrarAplicacionEnEdad = cerrarApliacionInt(edad);
                if(cerrarAplicacionEnEdad == 0){
                    cerrar = cerrarAplicacionEnEdad;
                    return cerrar;
                } else if (cerrarAplicacionEnEdad == 1 && edad == null) {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del cliente"));
                    cerrarAplicacionEnEdad = cerrarApliacionInt(edad);
                }
                Integer numeroId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cédula del cliente"));
                int cerrarAplicacionEnCedula = cerrarApliacionInt(numeroId);
                if(cerrarAplicacionEnCedula == 0){
                    cerrar = cerrarAplicacionEnCedula;
                    return cerrar;
                } else if (cerrarAplicacionEnCedula == 1 && numeroId == null) {
                    numeroId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cédula del cliente"));
                    cerrarAplicacionEnCedula = cerrarApliacionInt(numeroId);
                }
                String correo = JOptionPane.showInputDialog("Ingrese correo del cliente");
                int cerrarAplicacionEnCorreo = cerrarApliacionString(nombre);
                if(cerrarAplicacionEnCorreo == 0){
                    cerrar = cerrarAplicacionEnCorreo;
                    return cerrar;
                } else if (cerrarAplicacionEnCorreo == 1 && correo == null) {
                    correo = JOptionPane.showInputDialog("Ingrese correo del cliente");
                    cerrarAplicacionEnCorreo = cerrarApliacionString(nombre);
                }
                /*
                boolean respuesta = Optica.crearCliente(nombre, numeroContacto, edad, numeroId, correo);
                if(respuesta) {
                    JOptionPane.showMessageDialog(null,"El cliente se ha creado con éxito");
                }else {
                    JOptionPane.showMessageDialog(null,"EL cliente ya existe. Cliente NO cread0");
                }*/
                cerrar = cerrarAplicacion();
                return cerrar;
            }

        }
        return cerrar;
    }

    /**
     * Método para leer de acuerdo al proceso seleccionado
     * @param proceso
     * @return
     */
    public static int leer(String proceso){
        int cerrar = 1;
        if(proceso.equals(Proceso.CLIENTE.getNombre())){
            /*List<Cliente> listaClientes =  Optica.getListaClientes();
            for(int i = 0; i < listaClientes.size(); i++){
                JOptionPane.showMessageDialog(null,listaClientes.get(i).toString());
            }*/
            cerrar = cerrarAplicacion();
        }
        return cerrar;
    }

    /**
     * Método para Eliminar de acuerdo al proceso seleccionado
     * @param proceso
     * @return
     */
    public static int eliminar(String proceso){
        int cerrar = 1;
        if(proceso.equals(Proceso.CLIENTE.getNombre())) {
            String cedula = JOptionPane.showInputDialog("Ingrese cedula del cliente que desea eliminar");
            /*
            if (cedula != null) {
                boolean clienteEliminado = Optica.eliminarCliente(cedula);
                if (clienteEliminado) {
                    JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente NO ha ha sido encontrado");
                }

            }*/
        }
        return cerrar;
    }

    /**
     * Método para actualizar de acuerdo al proceso seleccionado
     * @param proceso
     * @return
     */
    public static int actualizar(String proceso){
        int cerrar = 1;
        if(proceso.equals(Proceso.CLIENTE.getNombre())){
            String cedula = JOptionPane.showInputDialog("Ingrese cedula del cliente que desea actualizar");

            /*if(cedula != null){
                Optica.ActualizarCliente2(cedula);
            }*/
        }
        return cerrar;
    }

}
