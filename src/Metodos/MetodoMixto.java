package Metodos;

public class MetodoMixto extends MetodoGeneracionRND 
{
    public MetodoMixto(long x0Ingresado)
    {
        super(x0Ingresado);
    }
    
    public double generarNumeroAleatorio(long a, long c, long m) 
    {
        long aXi = (a*xi);
                
        long xsiguiente = ((aXi + c) % m);
        double resultado = 0;
            

            resultado = ((double)xsiguiente) / (double) m;
        
        xi= xsiguiente;
            
        return resultado;
    }
    
}
