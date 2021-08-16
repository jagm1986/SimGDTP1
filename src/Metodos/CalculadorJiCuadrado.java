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
        valores095 = new double[] {16.919,23.685,30.144};
        valores0995 = new double[] {23.589,31.319,38.582};
        valores099 = new double[] {21.666,29.141,36.191};
        valores0975 = new double[] {19.023,26.119,32.852};
        valores090 = new double[] {14.684,21.064,27.204};
        
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
