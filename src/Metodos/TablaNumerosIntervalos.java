package Metodos;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TablaNumerosIntervalos extends AbstractTableModel
{
    private String[]  mColumnas ={"Intervalo","Frecuencia observada","Frecuencia esperada","Estadístico de la prueba","Estadistico Acumulado"};
    private ArrayList<Intervalo> intervalos;
   

     
    
    public TablaNumerosIntervalos(ArrayList<Intervalo> intervalosGenerados) {
        this.intervalos = intervalosGenerados;
        
    }
    
    @Override
    public int getRowCount()
    {
        int wRes = 5;
        if (intervalos.size() > 5)
        {
            wRes = intervalos.size();
        }
        return wRes;
    }

    @Override
    public int getColumnCount()
    {
        return mColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        String res = "";
        if (rowIndex < intervalos.size())
        {
           Intervalo aux = (Intervalo)intervalos.get(rowIndex);
            switch (columnIndex)
            {
                case 0:
                    res = aux.nombreIntervalo();
                    break;
                case 1:
                    res = Integer.toString(aux.getFrecuenciaObservada());
                    break;
                
                case 2:
                    res = Double.toString(aux.getFrecuenciaEsperada());
                    break;
                    
                case 3:
                    res = Double.toString(aux.getEstadistico());
                    break;
                
            }
            
        }
        return res;
    }

    @Override
    public String getColumnName(int column)
    {
        return mColumnas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){return false; }
   
}
