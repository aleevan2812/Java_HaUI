/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeForm;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuong
 */
public class EmployeeDTO implements Serializable{
    protected String EmployeeID, EmployeeName, Gender, Department, Position, Add, PhoneNumber, Email, DateOfBirth;
    


   
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String Add) {
        this.Add = Add;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public EmployeeDTO() {
        this.EmployeeID = "";
        this.EmployeeName = "";
        this.DateOfBirth = "";
        this.Gender = "";
        this.Department = "";
        this.Position = "";
        this.Add = "";
        this.PhoneNumber = "";
        this.Email = "";
    }

    public EmployeeDTO(String EmployeeID, String EmployeeName, String DateOfBirth, String Gender, String Department, String Position, String Add, String PhoneNumber, String Email) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.Department = Department;
        this.Position = Position;
        this.Add = Add;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        
    }
    
}
