
package programa10;
public class ClaseMovil {
    //ATRIBUTOS
    private double velocidad;
    private double tiempo;
    private double aceleracion;
    
    //CONSTRUCTOR
    public ClaseMovil(){
        velocidad=0;
        tiempo=0;
        aceleracion=0;
    }
    //METODO
    public void setVelocidad(String xvelocidad){ 
        velocidad=Double.parseDouble(xvelocidad); 
    } 
     public void setTiempo(String xtiempo){ 
        tiempo=Double.parseDouble(xtiempo); 
    } 
      public void setAceleracion(String xaceleracion){ 
        aceleracion=Double.parseDouble(xaceleracion); 
    } 
    public String getRecorrido(){
        double recorrido;
         recorrido = (velocidad * tiempo) + (0.5 * aceleracion * tiempo * tiempo);
        return String.valueOf(recorrido); 
    }
}
