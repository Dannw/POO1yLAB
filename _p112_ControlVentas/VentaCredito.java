package _p112_ControlVentas;

public class VentaCredito extends Venta{
    private int Meses;
    private double Intereses;

    public VentaCredito(String articulo, int cantidad, double precio) {
        super(articulo, cantidad, precio);
    }
    public VentaCredito(String articulo, int cantidad, double precio, int meses, double intereses) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Intereses = intereses;
    }

    public int getMeses() {
        return Meses;
    }
    public void setMeses(int meses) {
        Meses = meses;
    }
    public double getIntereses() {
        return Intereses;
    }
    public void setIntereses(double intereses) {
        Intereses = intereses;
    }

    @Override
    public double getTotalVenta() {
        double total = super.getPrecio() * super.getCantidad();
        total += (Meses * Intereses);
        return total;
    }
    @Override
    public String toString() {
        return "VentaCredito [Meses=" + Meses + ", Intereses=" + Intereses + ", Total con intereses=" + getTotalVenta() + "]";
    }

}