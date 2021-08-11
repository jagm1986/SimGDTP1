package Metodos;

public class MetodoMultiplicativo extends MetodoGeneracionRND
{
  
    public MetodoMultiplicativo(int x0Ingresado)
    {
        super(x0Ingresado);
    }
    
    public double generarNumeroAleatorio(int a, int c, int m)
    {
        
        int aXi = (a*xi);
                
        int xsiguiente = (aXi % m);
        
        
        double resultado = 0;
        

            resultado = ((double)xsiguiente) / (double) m;
            
        xi=xsiguiente;
        
        return resultado;
    }
    
}
