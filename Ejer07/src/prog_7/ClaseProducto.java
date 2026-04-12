package prog_7;

public class ClaseProducto{
    //ATRIBUTOS
    private String nombre;
    private double precioDeCosto;
    private double precioDeVenta;

    //CONSTRUCTOR
    public ClaseProducto() {
        nombre = "";
        precioDeCosto = 0;
        precioDeVenta = 0;
    }

    //METODOS
    public void setNombre(String xnombre) {
        nombre = xnombre;
    }

    public void setPrecioDeCosto(String xprecioCosto) {
        precioDeCosto = Double.parseDouble(xprecioCosto);
    }

    public void setPrecioDeVenta(String xprecioVenta) {
        precioDeVenta = Double.parseDouble(xprecioVenta);
    }

    public String getGanancia() {
        double ganancia;
        ganancia = precioDeVenta - precioDeCosto;
        return String.valueOf(ganancia);
    }
}

