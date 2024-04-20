package util;


import model.TaiKhoan;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class XuLyFile {
    private static final String DUONG_DAN_FILE = "D:\\saveData.txt";
    private static final String LUU_ID = "D:\\saveID.txt";
    private static final String LUU_TEN_TAIKHOAN = "D:\\saveAccountRegister.txt";
    public static void luuTaiKhoan(TaiKhoan taiKhoan) throws IOException{
        ObjectOutputStream objectOutputStream = null;
        
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(DUONG_DAN_FILE));
            objectOutputStream.reset();
            objectOutputStream.writeObject(taiKhoan);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }
    
    public static TaiKhoan layTaiKhoan() throws IOException{
        ObjectInputStream objectInputStream = null;
        
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(DUONG_DAN_FILE));
            return (TaiKhoan) objectInputStream.readObject();
        } catch (Exception e) {
            return null;
        } finally { 
            if(objectInputStream != null){
                objectInputStream.close();
            }
        }
    }
    
    public static void luuIDTaiKhoan(int ID) throws IOException{
        ObjectOutputStream objectOutputStream = null;
        
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(LUU_ID));
            objectOutputStream.reset();
            objectOutputStream.writeInt(ID);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }
    
    public static int layIDTaiKhoan() throws IOException{
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(DUONG_DAN_FILE));
            return objectInputStream.readInt();
        } catch (Exception e) {
            return -1;
        } finally { 
            if(objectInputStream != null){
                objectInputStream.close();
            }
        }
    }
    
    public static void LuuTenTenKhoan(String taiKhoan) throws IOException{
        ObjectOutputStream objectOutputStream = null;
        
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(LUU_TEN_TAIKHOAN));
            objectOutputStream.reset();
            objectOutputStream.writeObject(taiKhoan);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }
    
    public static String layTenTaiKhoan() throws IOException{
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(LUU_TEN_TAIKHOAN));
            return (String) objectInputStream.readObject();
        } catch (Exception e) {
            return null;
        } finally { 
            if(objectInputStream != null){
                objectInputStream.close();
            }
        }
    }
}
