package _p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String Nombre;
    protected char Sexo;
    protected String Descripción;
    protected Double Salario;
    protected Double Total;
    public Jugador(String nombre, char sexo, String descripción, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripción = descripción;
        Salario = salario;
    }

    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripción=" + Descripción + ", Salario=" + Salario + "]";
    }

   
    
    

    

    
}
