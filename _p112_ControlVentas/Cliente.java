package _p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
   private String Nombre;
   private String Domicilio;
   private String Correo;
   private ArrayList<Venta> Ventas;
public Cliente(String nombre, String domicilio, String correo, ArrayList<Venta> ventas) {
    Nombre = nombre;
    Domicilio = domicilio;
    Correo = correo;
    Ventas = ventas;
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
public String getCorreo() {
    return Correo;
}
public void setCorreo(String correo) {
    Correo = correo;
}
public ArrayList<Venta> getVentas() {
    return Ventas;
}
public void setVentas(ArrayList<Venta> ventas) {
    Ventas = ventas;
}
@Override
public String toString() {
    return "Cliente [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Ventas=" + Ventas + "]";
}



}