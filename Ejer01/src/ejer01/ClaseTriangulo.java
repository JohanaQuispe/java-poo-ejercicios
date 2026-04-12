package ejer01;
public class ClaseTriangulo {
     private double base;
    private double altura;
 
    public ClaseTriangulo() {
        base = 0;
        altura = 0;
    }
 
    public void setBase(String xbase) {
        base = Double.parseDouble(xbase);
    }
 
    public void setAltura(String xaltura) {
        altura = Double.parseDouble(xaltura);
    }
 
    public String getArea() {
        return String.valueOf((base * altura) / 2);
    }
}
