

package Metodos;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TablaNumeros extends AbstractTableModel
{
    private String[]  mColumnas ={"Orden","Aleatorio"};
    private ArrayList<Double> numeros;
   

     
    
    public TablaNumeros(ArrayList<Double> nums) {
        this.numeros = nums;
        
    }
    
    @Override
    public int getRowCount()
    {
        int wRes = 5;
        if (numeros.size() > 5)
        {
            wRes = numeros.size();
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
        if (rowIndex < numeros.size())
        {
           Double aux = (Double)numeros.get(rowIndex);
            switch (columnIndex)
            {
                case 0:
                    res =""+ (rowIndex +1);
                    break;
                case 1:
                    res =""+ String.format("%.4f", aux);
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
