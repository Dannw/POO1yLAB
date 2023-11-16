package _p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Daniel Varela", 19, 'H', "Soltero", "Delantero", 2000));
        datos.add(new Jugador("Emiliano Varela", 34, 'H', "Casado", "Portero", 1500));
        datos.add(new Jugador("Lluvia Viridiana", 22, 'M', "Soltera", "Defensa", 1700));
        return datos;
    }
    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();  
    }
    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}
