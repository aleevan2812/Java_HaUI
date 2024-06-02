/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class KetNoiCSDL { 
    private static final String URL = "jdbc:mysql://localhost:3306/quanlyluongthuong";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Alee123.";
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if(connection == null){
                throw new Exception();
            }
            
            System.out.println("Ket noi CSDL thanh cong");
            return connection;
        }
        catch(Exception e){
            System.out.println("Ket noi CSDL that bai");
            return null;
        }
    }
}
