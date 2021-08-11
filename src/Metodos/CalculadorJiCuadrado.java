package Metodos;

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

    
    public boolean superaPrueba(int gradosLibertad, double estadistico, int significancia)
    {
        boolean resultado = false;
        double[] columnaATrabajar = null;
        
        
        switch (significancia)
        {
            case 950:
                columnaATrabajar = valores095;
                break;
            
            case 995:
                columnaATrabajar = valores0995;
                break;
                
            case 990:
                columnaATrabajar = valores099;
                break;
                
            case 975:
                columnaATrabajar = valores0975;
                break;
                
            case 900:
                columnaATrabajar = valores090;
                break;
        } 
        
        int posicion = 0;
        
        if(gradosLibertad == 9) posicion = 0;
        if(gradosLibertad == 14) posicion = 1;
        if(gradosLibertad == 19) posicion = 2;
        
        double valorReferencia = columnaATrabajar[posicion];
        
        System.out.println("Valor de referencia: " + valorReferencia);
        System.out.println("Estadistico recibido: " + estadistico);
        
        if(estadistico <= valorReferencia) resultado = true;
        
        return resultado;
    }
    
    
}
