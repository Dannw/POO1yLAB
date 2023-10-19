package _p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    public Tienda(String nombre, String propietario, String domicilio, ArrayList<Cliente> clientes) {
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
        Clientes = clientes;
    }

    
    
}
