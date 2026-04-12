package ejercicio4;
public class ClaseTrianguloRectangulo {
    private double cateto1;
    private double cateto2;
    private double Respuesta;
    
    public ClaseTrianguloRectangulo(){
        cateto1 = 0;
        cateto2 =0;
        Respuesta =0;
    }
      public void setcateto1(String xcateto1){
        
        cateto1=Double.parseDouble (xcateto1);
        
    
    }
     public void setcateto2(String xcateto2){
        
        cateto2=Double.parseDouble (xcateto2);
     }
     // Método para el área
    public double getArea(){
        Respuesta = (cateto1 * cateto2) / 2;
        return Respuesta;
    }

    // Método para la hipotenusa
    public double getHipotenusa(){
        Respuesta = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return Respuesta;
    }

    // Método para el perímetro
    public double getPerimetro(){
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        Respuesta = cateto1 + cateto2 + hipotenusa;
        return Respuesta;
    }
}
