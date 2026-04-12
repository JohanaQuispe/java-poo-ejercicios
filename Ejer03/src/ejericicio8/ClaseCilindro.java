/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio8;

/**
 *
 * @author Azul Fernandez
 */
public class ClaseCilindro {
     private int radio;
    private int altura;
    private int Volumen;
    
    public ClaseCilindro(){
      radio=0;
              altura=0;
                      Volumen=0;
    }
    //METODOS
     public void setradio(String xradio){
        
        radio=Integer.parseInt (xradio);
        
    
    }
     public void setaltura(String xaltura){
        
        altura=Integer.parseInt (xaltura);
     
    }
    public String getVolumen(){
        Volumen = (int) (Math.PI * radio * radio * altura); 
        return String.valueOf(Volumen); 
    }
}
