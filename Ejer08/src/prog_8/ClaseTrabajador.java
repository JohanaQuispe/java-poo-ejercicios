package prog_8;
public class ClaseTrabajador {
//ATRIBUTOS
    private double precioHora;
    private double horasTrabajadas;

    //CONSTRUCTOR
    public ClaseTrabajador() {
        precioHora = 0;
        horasTrabajadas = 0;
    }

    //METODOS SET
    public void setNombre(String xnombre) {
    }

    public void setPrecioHora(String xprecioHora) {
        precioHora = Double.parseDouble(xprecioHora);
    }

    public void setHorasTrabajadas(String xhoras) {
        horasTrabajadas = Double.parseDouble(xhoras);
    }

    //METODOS GET (Cálculos)
    public String getSalarioBruto() {
        double bruto;
        bruto = precioHora * horasTrabajadas;
        return String.valueOf(bruto);
    }

    public String getImpuesto() {
        double bruto;
        double impuesto;
        bruto = precioHora * horasTrabajadas;
        impuesto = bruto * 0.10; // 10 por ciento del salario bruto 
        return String.valueOf(impuesto);
    }

    public String getSalarioNeto() {
        double bruto;
        double impuesto;
        double neto;
        bruto = precioHora * horasTrabajadas;
        impuesto = bruto * 0.10;
        neto = bruto - impuesto;
        return String.valueOf(neto);
    }
}