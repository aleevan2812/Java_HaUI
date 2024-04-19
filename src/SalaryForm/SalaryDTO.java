/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalaryForm;

import EmployeeForm.EmployeeDTO;
import java.util.Date;

/**
 *
 * @author cuong
 */
public class SalaryDTO extends EmployeeDTO{
    private double coefficientsSalary, baseSalary, bonus, penalty, allowances;

    public SalaryDTO() {
        this.coefficientsSalary = 2.0;
        this.baseSalary = 2000000;
        this.bonus = 0;
        this.penalty = 0;
        this.allowances =500000;
    }
    
    public SalaryDTO(EmployeeDTO e) {
        super(e.getEmployeeID(), e.getEmployeeName(), e.getDateOfBirth(), e.getGender(), e.getDepartment(), e.getPosition(), e.getAdd(), e.getPhoneNumber(), e.getEmail());
        this.coefficientsSalary = 2.0;
        this.baseSalary = 2000000;
        this.bonus = 0;
        this.penalty = 0;
        this.allowances =500000;
    }

    public SalaryDTO(double coefficientsSalary, double baseSalary, double bonus, double penalty, double allowances) {
        this.coefficientsSalary = coefficientsSalary;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.allowances = allowances;
    }
    
    public SalaryDTO(double coefficientsSalary, double baseSalary, double bonus, double penalty, double allowances, String EmployeeID, String EmployeeName, String DateOfBirth, String Gender, String Department, String Position, String Add, String PhoneNumber, String Email) {
        super(EmployeeID, EmployeeName, DateOfBirth, Gender, Department, Position, Add, PhoneNumber, Email);
        this.coefficientsSalary = coefficientsSalary;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.allowances = allowances;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    @Override
    public String toString() {
        return "SalaryDTO{" + "coefficientsSalary=" + coefficientsSalary + ", baseSalary=" + baseSalary + ", bonus=" + bonus + ", penalty=" + penalty + ", allowances=" + allowances + '}';
    }
    
    
    
    
}
