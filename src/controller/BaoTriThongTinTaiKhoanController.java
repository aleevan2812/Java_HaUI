package controller;

import model.TaiKhoan;
import util.IUpdateTableEvent;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaoTriThongTinTaiKhoanController {
    private static final String QUERY_ALL_TAIKHOAN = "select * from TaiKhoan";
    private static final String FIND_TAIKHOAN_BY_ID = "select MaTaiKhoan from TaiKhoan where TaiKhoan = ?";
    private static final String INSERT_NEW_TAIKHOAN = "insert into TaiKhoan(TaiKhoan, MatKhau, Quyen) values(?,?,?)";
    private static final String UPDATE_TAIKHOAN = "update TaiKhoan set TaiKhoan = ?, MatKhau = ?, Quyen = ? where MaTaiKhoan = ?";
    private static final String DELETE_TAIKHOAN = "delete from TaiKhoan where MaTaiKhoan = ?";
    
    private static IUpdateTableEvent iUpdateTableEvent;
    
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
    public long onFindTaiKhoanID(String tenTaiKhoan) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_TAIKHOAN_BY_ID);
            preparedStatement.setString(1, tenTaiKhoan);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            
            return resultSet.getLong(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } 
        finally{
            if(connection != null){
                connection.close();
            }
        }
    }
    public ArrayList<TaiKhoan> onQueryAllTaiKhoan() throws SQLException
    {
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL_TAIKHOAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<TaiKhoan> answer= new ArrayList<>();
            
            while(resultSet.next()){
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setMaTaiKhoan(resultSet.getLong(1));
                taiKhoan.setTaiKhoan(resultSet.getString(2));
                taiKhoan.setMatKhau(resultSet.getString(3));
                taiKhoan.setQuyen(resultSet.getInt(4));
                answer.add(taiKhoan);
            }
        
            return answer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
        finally{
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void addNewTaiKhoan(TaiKhoan taiKhoan) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_TAIKHOAN);
            preparedStatement.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement.setString(2, taiKhoan.getMatKhau());
            preparedStatement.setInt(3, taiKhoan.getQuyen());
            preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally{
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void updateTaiKhoanByID(TaiKhoan taiKhoan) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TAIKHOAN);
            preparedStatement.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement.setString(2, taiKhoan.getMatKhau());
            preparedStatement.setInt(3, taiKhoan.getQuyen());
            preparedStatement.setLong(4, taiKhoan.getMaTaiKhoan());
            
            preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally{
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void deleteTaiKhoanByID(long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_TAIKHOAN);
            preparedStatement.setLong(1, ID);
            preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally{
            if(connection != null){
                connection.close();
            }
        }
    }
}
