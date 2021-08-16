package Metodos;

import java.util.Random;


public class GeneradorNumerosAleatorios {

    public GeneradorNumerosAleatorios(){}
    
 
    public double generarAleatorioUniforme(double extremoIzquierdo, double extremoDerecho, MetodoGeneracionRND metodoSeleccionado, long aIngresado, long cIngresado, long mIngresado)
    {
        
        double rnd = metodoSeleccionado.generarNumeroAleatorio(aIngresado,cIngresado,mIngresado);
        double resultado = extremoIzquierdo + (rnd *(extremoDerecho - extremoIzquierdo));
        return resultado;
    }
    
    
}
