package programa6;
public class Datos {
 public int numero1;
 public int numero2;
 public int numero3;
 public int suma;
 public int promedio;
 public int mayor;
 public int menor;

public Datos(int n1,int n2,int n3)
{
    this.numero1=n1;
    this.numero2=n2;
    this.numero3=n3;
    this.suma=0;
    this.promedio=0;
    this.mayor=0;
    this.menor=0;
}
public void Csuma()
{
    this.suma=(this.numero1 + this.numero2 + this.numero3);
}
public void Cpromedio()
{
    this.promedio=(this.numero1 + this.numero2 + this.numero3)/3;
}
public void Cmayor()
{
    if (this.numero1>this.numero2 && this.numero1>this.numero3)
    {
        this.mayor= this.numero1;
    }else if (this.numero2>this.numero3)
    {
        this.mayor= this.numero2;
    }else 
    {
        this.mayor= this.numero3;
    }
}
public void Cmenor()
{
    if (this.numero1<this.numero2 && this.numero1<this.numero3)
    {
        this.menor= this.numero1;
    }else if (this.numero2<this.numero3)
    {
        this.menor= this.numero2;
    }else 
    {
        this.menor= this.numero3;
    }
}
}
