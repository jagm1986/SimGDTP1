package Metodos;

public class MetodoMultiplicativo extends MetodoGeneracionRND
{
  
    public MetodoMultiplicativo(long x0Ingresado)
    {
        super(x0Ingresado);
    }
    
    public double generarNumeroAleatorio(long a, long c, long m)
    {
        
        long aXi = (a*xi);
                
        long xsiguiente = (aXi % m);
        
        
        double resultado = 0;
        

            resultado = ((double)xsiguiente) / (double) m;
            
        xi=xsiguiente;
        
        return resultado;
    }
    
}
