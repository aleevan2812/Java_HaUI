/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeForm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cuong
 */
public class EmployeeDAO extends AbstractTableModel{
     public String columns[] = {"Employee ID", "Employee Name","Date of birth", "Gender", "Department", "Position", "Address", "Phone number", "Email"};
    public Class classess[] = {String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<EmployeeDTO> list_emp = new ArrayList<>();
    public EmployeeDAO(ArrayList<EmployeeDTO> dp){
          list_emp = dp;
    } 

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list_emp.size();
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
                return list_emp.get(RowIndex).getEmployeeID();
                 case 1 :
                return list_emp.get(RowIndex).getEmployeeName();
                 case 2:
                return list_emp.get(RowIndex).getDateOfBirth();
                 case 3 :
                return list_emp.get(RowIndex).getGender();
                 case 4 :
                return list_emp.get(RowIndex).getDepartment();
                 case 5 :
                return list_emp.get(RowIndex).getPosition();
                 case 6 :
                return list_emp.get(RowIndex).getAdd();
                 case 7 :
                return list_emp.get(RowIndex).getPhoneNumber();
                 case 8 :
                return list_emp.get(RowIndex).getEmail();
                
                
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
