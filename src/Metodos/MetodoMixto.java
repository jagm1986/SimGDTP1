package Metodos;

public class MetodoMixto extends MetodoGeneracionRND 
{
    public MetodoMixto(int x0Ingresado)
    {
        super(x0Ingresado);
    }
    
    public double generarNumeroAleatorio(int a, int c, int m) 
    {
        int aXi = (a*xi);
                
        int xsiguiente = ((aXi + c) % m);
        double resultado = 0;
            

            resultado = ((double)xsiguiente) / (double) m;
        
        xi= xsiguiente;
            
        return resultado;
    }
    
}
