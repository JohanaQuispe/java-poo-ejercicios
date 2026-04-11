package programa5;
public class Datos {
public int nota1;
public int nota2;
public int nota3;
public int promedio;
public String condicion;

public Datos(int n1,int n2,int n3)
{
    this.nota1=n1;
    this.nota2=n2;
    this.nota3=n3;
    this.promedio=0;
    this.condicion="---";
}
public void Cpromedio()
{
    this.promedio=(this.nota1 + this.nota2 + this.nota3)/3;
}
public void Ccondicion()
{
    if(this.promedio>=13 && this.promedio<=20)
    {
        this.condicion="Aprobado";
    }else if(this.promedio>=0 && this.promedio<=12)
    {
        this.condicion="Desaprobado";
    }else
    {
        this.condicion="Error";
    }
}
}
