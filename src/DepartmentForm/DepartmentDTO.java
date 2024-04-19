/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartmentForm;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author admin
 */
public class DepartmentDTO implements Serializable {
    private String ID,name,manager,type;
    private String quantity;
    private String date;
    private int number = 0;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }



    public void setNumber(int number) {
        this.number = number;
    }



    public int getNumber() {
        return number;
    }
    
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public String getDate() {
        return date;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public DepartmentDTO(String ID, String name, String manager, String date, int number, String type) {
        this.ID = ID;
        this.name = name;
        this.manager = manager;
        this.date = date;
        this.quantity = number + "";
        this.type = type;
    }

    public DepartmentDTO() {
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" + "ID=" + ID + ", name=" + name + ", manager=" + manager + ", type=" + type + ", quantity=" + quantity + ", date=" + date + '}';
    }
    
    
}
