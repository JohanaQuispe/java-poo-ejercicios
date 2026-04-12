package ejer02;
public class ClasePotencia {
    private double numeroReal;
 
    public ClasePotencia() {
        numeroReal = 0;
    }
 
    public void setNumeroReal(String xnumero) {
        numeroReal = Double.parseDouble(xnumero);
    }
 
    public String getCuadrado() {
        return String.valueOf(numeroReal * numeroReal);
    }
 
    public String getCubo() {
        return String.valueOf(numeroReal * numeroReal * numeroReal);
    }
}
