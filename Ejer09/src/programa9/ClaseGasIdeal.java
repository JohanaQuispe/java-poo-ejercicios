
package programa9;

public class ClaseGasIdeal {
    //ATRIBUTOS
    private double temperatura;
    private double moles;
    private double volumen;
    
    private static final double R = 0.0821; //la constante
    //CONSTRUCTOR
    public ClaseGasIdeal(){
        temperatura=0;
        moles=0;
        volumen=0;
    }
    //METODO
    public void setTemperatura(String xtemperatura){ 
        temperatura=Double.parseDouble(xtemperatura); 
    } 
     public void setMoles(String xmoles){ 
        moles=Double.parseDouble(xmoles); 
    } 
      public void setVolumen(String xvolumen){ 
        volumen=Double.parseDouble(xvolumen); 
    } 
    public String getPresion(){
        double presion;
         presion = (moles * R * temperatura) / volumen;
        return String.valueOf(presion); 
    }
}
