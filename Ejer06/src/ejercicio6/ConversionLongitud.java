/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Unity K
 */
public class ConversionLongitud {
    private double metros, pies, pulgadas;
    
    public ConversionLongitud()
    {
        metros = 0.0;
        pies = 0.0;
        pulgadas = 0.0;
    }
    
    public void getmetros(String met)
    {
       metros = Double.parseDouble(met); 
    }
    
    public String Convertirpies()
  {
      pies = (metros * 3.281);
      return String.valueOf(pies);
  }
    
    public String Convertirpulgadas()
  {
      pulgadas = (metros * 39.37);
      return String.valueOf(pulgadas);
  }
}
