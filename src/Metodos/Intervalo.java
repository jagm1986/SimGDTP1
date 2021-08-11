
package Metodos;

import java.text.DecimalFormat;


public class Intervalo 
{
    private double valorInicio;
    private double valorFin;
    private int frecuenciaObservada ;
    private float frecuenciaEsperada;
    private double valorEstadistico;
    private double valorEstadisticoAcumulado;

    public void setValorEstadisticoAcumulado(double valorEstadisticoAcumulado) {
        this.valorEstadisticoAcumulado = valorEstadisticoAcumulado;
    }

    public double getValorEstadisticoAcumulado() {
        return valorEstadisticoAcumulado;
    }
    
        
    public Intervalo(double valorInicio, double valorFin, float frecuenciaEsperadaCalculada) {
        this.valorInicio = valorInicio;
        this.valorFin = valorFin;
        frecuenciaObservada=0;
        frecuenciaEsperada = frecuenciaEsperadaCalculada;
    }

    Intervalo() {}

    public double getValorInicio() {
        return valorInicio;
    }

    public double getValorFin() {
        return valorFin;
    }

    public void setValorFin(double valorFin) {
        this.valorFin = valorFin;
    }
    
    
    public void aumentarFrecuenciaObservada()
    {
      frecuenciaObservada++;
    }
    
    public boolean contiene(double n)
    {
      return (n >= valorInicio  && n < valorFin  );
    }
    
    public void generarEstadistico()
    {
        double numerador = Math.pow((double)(frecuenciaEsperada - frecuenciaObservada),2);
        double resultado = numerador / (double) frecuenciaEsperada;
        
        if(frecuenciaEsperada == 0) resultado = 0;
        
        valorEstadistico = resultado;
    }
    
    public String nombreIntervalo()
    {
        DecimalFormat df = new DecimalFormat("##.##");
        return df.format(valorInicio) + " - "+df.format(valorFin);
    }
    
    
    
    public int getFrecuenciaObservada() {
        return frecuenciaObservada;
    }
    
    public float getFrecuenciaEsperada() 
    {
        return frecuenciaEsperada;
    } 
    
    public double getEstadistico()
    {
        return valorEstadistico;
    }
    
}
