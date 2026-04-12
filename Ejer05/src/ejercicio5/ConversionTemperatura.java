/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Unity K
 */
public class ConversionTemperatura {
    private double temperatura;
    private double fahrenheit;
    
  public ConversionTemperatura()
  {
      temperatura = 0.0;
      fahrenheit = 0.0;
  } 
  
  public void setTemp(String temp)
  {
      temperatura = Double.parseDouble(temp);
  }
  public String ConvertirGrados()
  {
      fahrenheit = (temperatura * 9/5) + 32;
      return String.valueOf(fahrenheit);
  }
}