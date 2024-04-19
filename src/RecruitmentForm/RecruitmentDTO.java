package RecruitmentForm;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caotrungduc
 */
public class RecruitmentDTO implements Serializable {
    private String title, position, gender, deadline, degree, experience;
    private int age, quantity;

    public RecruitmentDTO() {
    }

    public RecruitmentDTO(String title, String position, String gender, String deadline, String degree, String experience, int age, int quantity) {
        this.title = title;
        this.position = position;
        this.gender = gender;
        this.deadline = deadline;
        this.degree = degree;
        this.experience = experience;
        this.age = age;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) throws Exception {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate.parse(deadline, formatter);
        } catch (Exception e) {
            throw new Exception("Invalid date (dd-MM-yyyy)");
        }
        
        this.deadline = deadline;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getExperience() {
        return experience;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception { 
        if (age < 18) throw new Exception("The age is at least 18");
        this.age = age;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws Exception {
        if (quantity <= 0) throw new Exception("The quantity is over 0");
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "RecruitmentDTO{" + "title=" + title + ", position=" + position + ", gender=" + gender + ", deadline=" + deadline + ", degree=" + degree + ", experience=" + experience + ", age=" + age + ", quantity=" + quantity + '}';
    }
}
