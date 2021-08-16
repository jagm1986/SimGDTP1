package Metodos;



public abstract class MetodoGeneracionRND {

       
  protected long xi;

    
    public MetodoGeneracionRND(long x0)
    {
        xi= x0;
    }
  
    public abstract double generarNumeroAleatorio(long aIngresado, long cIngresado, long mIngresado);
    
}
