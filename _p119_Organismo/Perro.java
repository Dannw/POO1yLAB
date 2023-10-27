package _p119_Organismo;

public class Perro extends Organismo implements Canino {
    
    @Override
    public void multicelular() {
        System.out.println("Es un animal multicelular es un perro");

    }
    @Override
    public void sangreCaliente() {

        System.out.println("Es un animal de sangre caliente es un Perro");
    }
    @Override
    public void correr() {
        System.out.println("Es un canino que corre es un Perro");

    }
    @Override
    public void cuatroPatas() {
        System.out.println("Es un canino que camina en cuatro patas es Perro");
    }

    
}
