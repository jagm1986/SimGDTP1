package Metodos;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;

public class CalculadorJiCuadrado {

    private double[] valores095;
    private double[] valores0995;
    private double[] valores099;
    private double[] valores0975;
    private double[] valores090;
    
    public CalculadorJiCuadrado()
    {
        
    }

    
    public boolean superaPrueba(int gradosLibertad, double estadistico, double significancia)
    {
        boolean resultado = false;
        double[] columnaATrabajar = null;
        
      
        
        double valorReferencia = 0;
        
        ChiSquaredDistribution csd = new ChiSquaredDistribution((double)gradosLibertad);
        valorReferencia = csd.inverseCumulativeProbability((double)significancia);
        System.out.println("Valor de referencia: " + valorReferencia);
        System.out.println("Estadistico recibido: " + estadistico);
        
        if(estadistico <= valorReferencia) resultado = true;
        
        return resultado;
    }
    
    
}
