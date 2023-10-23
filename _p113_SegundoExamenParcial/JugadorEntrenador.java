package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripción, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripción, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total = Salario + this.getBono();

    }


    @Override
    public double getBono(){
        return (Subordinados * 40) + (Proyectos * 50);
    }

    @Override
    public String toString() {
        return "JugadorEntrenador Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", Bono=" + getBono() + ", Total=" + Total+ "]";
    }

    
    
    
}
