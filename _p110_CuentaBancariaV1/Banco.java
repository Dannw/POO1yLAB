package _p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Cliente;
    public Banco() {
        Cliente = new ArrayList<>(); 
    }
    public Banco(String nombre, String domicilio) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
        
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }
    public ArrayList<Cliente> getCliente() {
        return Cliente;
    }
    public void agregarCliente(Cliente cliente) {
        Cliente.add(cliente);
    }
    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Cliente=" + Cliente.size() + "]";
    }
    
    

    
}
