package _p119_Organismo;

public class Perico  extends Organismo implements Ave{
    public Perico(String nombre) {
        super(nombre);
    }
    @Override
    public void multicelular() {
        System.out.println("Es un animal de sangre caliente es un perico");

    }
    @Override
    public void sangreCaliente() {
        System.out.println("Es un canimal de sangre caliente es un Perico");

    }
    @Override
    public void dosPatas() {
        System.out.println("Es un avr que tiene dos patas es un Perico");

    }
    @Override
    public void volar() {
        System.out.println("Es un ave puede volar es un Perico"):
    }
    
}
