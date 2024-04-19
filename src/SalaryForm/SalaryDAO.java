/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalaryForm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class SalaryDAO extends AbstractTableModel{
    public String columns[] = {"ID","Name","Department","Position","Coefficients Salary", "Base salary", "Bonus", "Penalty", "Allowances","Total Salary"};
    public Class classess[] = {String.class,String.class,String.class,String.class,Double.class,Double.class,Double.class,Double.class,Double.class, Double.class};
    
    ArrayList<SalaryDTO> list = new ArrayList<>();
    public SalaryDAO(ArrayList<SalaryDTO> sl){
          list = sl;
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
                return list.get(RowIndex).getEmployeeID();
                 case 1 :
                return list.get(RowIndex).getEmployeeName();
                 case 2:
                return list.get(RowIndex).getDepartment();
                 case 3 :
                return list.get(RowIndex).getPosition();
                 case 4 :
                return list.get(RowIndex).getCoefficientsSalary();
                 case 5 :
                return list.get(RowIndex).getBaseSalary();
                 case 6:
                     return list.get(RowIndex).getBonus();
                 case 7:
                  return list.get(RowIndex).getPenalty();
                 case 8: 
                     return list.get(RowIndex).getAllowances();
                 case 9:
                     return list.get(RowIndex).getCoefficientsSalary()*list.get(RowIndex).getBaseSalary()+list.get(RowIndex).getBonus()-list.get(RowIndex).getPenalty()+list.get(RowIndex).getAllowances();
                
                
                
                 default: return null;
        }
      
     
    }
    @Override
     public Class getColumnClass(int ColumnIndex){
           return classess[ColumnIndex];
       }
     public String getColumnName(int Column){
           return columns[Column];
       }
    
}
