package _p147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable  {
    String Nombre;
    int Edad;
    char Sexo;
    String EstadoCivil;
    String Descripción;
    double Salario;
    public Jugador() {
    }
    public Jugador(String nombre, int edad, char sexo, String estadoCivil, String descripción, double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EstadoCivil = estadoCivil;
        Descripción = descripción;
        Salario = salario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char string) {
        Sexo = string;
    }
    public String getEstadoCivil() {
        return EstadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }
    public String getDescripción() {
        return Descripción;
    }
    public void setDescripción(String descripción) {
        Descripción = descripción;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    
    
    

    
}
