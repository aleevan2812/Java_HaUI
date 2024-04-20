package controller;

import model.NhanVien;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class XemThongTinCaNhanController {
    private static final String GET_USER_INFO = "select TenNhanVien, GioiTinh, NgaySinh,"
    + " DiaChi, ChucVu, TrinhDo from NhanVien" +
    "where MaTaiKhoan = ?";
    
    public static NhanVien onCallUserData(int id){
        try {
            Connection connection = KetNoiCSDL.getConnection();
           
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_INFO);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            
            NhanVien nhanVien = new NhanVien();
            nhanVien.setTenNhanVien(resultSet.getString(1));
            nhanVien.setGioiTinh(resultSet.getInt(2));
            nhanVien.setNgaySinh(new Date(resultSet.getDate(3).getTime()));
            nhanVien.setDiaChi(resultSet.getString(4));
            nhanVien.setChucVu(resultSet.getString(5));
            nhanVien.setTrinhDo(resultSet.getString(6));
            return nhanVien;
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void onUpdateUserInfo(NhanVien nhanvien){
        try {
            Connection connection = KetNoiCSDL.getConnection();
           
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_INFO);
           
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            
            NhanVien nhanVien = new NhanVien();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
