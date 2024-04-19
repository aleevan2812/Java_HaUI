/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DepartmentForm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class DepartmentDAO extends AbstractTableModel{
    public String columns[] = {"ID","Name","Type","Manager","Quantity","Date"};
    public Class classess[] = {String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<DepartmentDTO> list = new ArrayList<>();
    public DepartmentDAO(ArrayList<DepartmentDTO> dp){
          list = dp;
    } 

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return columns.length;
    }

    @Override
    public Object getValueAt(int RowIndex, int ColumnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(ColumnIndex){
            case 0 :
                return list.get(RowIndex).getID();
                 case 1 :
                return list.get(RowIndex).getName();
                 case 2:
                return list.get(RowIndex).getType();
                 case 3 :
                return list.get(RowIndex).getManager();
                 case 4 :
                return list.get(RowIndex).getQuantity();
                 case 5 :
                return list.get(RowIndex).getDate();
                
                
                
                 default: return null;
        }
      
     
    }
     public Class getColumnClass(int ColumnIndex){
           return classess[ColumnIndex];
       }
     public String getColumnName(int Column){
           return columns[Column];
       }
    
}
