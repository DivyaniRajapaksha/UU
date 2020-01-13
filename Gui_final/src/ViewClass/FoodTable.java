/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ruvini
 */
public class FoodTable extends AbstractTableModel{
    private String[] columns;
    private Object[][] rows;

    public FoodTable(){}
    public FoodTable(Object[][] data,String[] columnName){
        this.rows=data;
        this.columns=columnName;
      
    }
    
    public Class getColumnClass(int column){
        if(column==5){
            return Icon.class;
        }else{
            return getValueAt(0,column).getClass();
        }
    }
    @Override
    public int getRowCount() {
       
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    
    public String getColumnNames(int co1){
        return this.columns[co1];
    }
}
