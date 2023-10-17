package co.edu.uniquindio.optica.enums;

public enum Proceso {
    CLIENTE("Clientes");
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    Proceso(String nombre) {
        this.nombre = nombre;
    }

    public static String[] proceso(){
        String[] proceso = {
                Proceso.CLIENTE.getNombre(),
        };
        return proceso;
    }

}
