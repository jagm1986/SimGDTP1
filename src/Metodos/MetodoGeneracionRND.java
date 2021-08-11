package Metodos;



public abstract class MetodoGeneracionRND {

       
  protected int xi;

    
    public MetodoGeneracionRND(int x0)
    {
        xi= x0;
    }
  
    public abstract double generarNumeroAleatorio(int aIngresado, int cIngresado, int mIngresado);
    
}
