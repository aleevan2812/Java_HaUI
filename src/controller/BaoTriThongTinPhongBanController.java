package controller;

import model.PhongBan;
import util.IUpdateTableEvent;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaoTriThongTinPhongBanController {
    private static final String QUERY_ALL_PHONGBAN = "select * from PHONGBAN";
    private static final String INSERT_NEW_PHONGBAN = "insert into PHONGBAN(TENPHONG, TEN_TRUONGPHONG) values(?, ?)";
    private static final String UPDATE_PHONGBAN = "update PHONGBAN set TENPHONG = ?, TEN_TRUONGPHONG = ? where MAPHONG = ?";
    private static final String DELETE_PHONGBAN = "delete from PHONGBAN where MAPHONG = ?";
     private static final String QUERY_ALL_MAPHONG="select maphong from phongban;";
    private IUpdateTableEvent iUpdateTableEvent;
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
     public ArrayList<String> onQueryAllMaPhong() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL_MAPHONG);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<String> answer= new ArrayList<>();
            
            while(resultSet.next()){
               answer.add(resultSet.getString("maphong"));
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
    public ArrayList<PhongBan> onQueryAllPhongBan() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL_PHONGBAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<PhongBan> answer= new ArrayList<>();
            
            while(resultSet.next()){
               PhongBan phongBan = new PhongBan(
                    resultSet.getLong(1),
                    resultSet.getString(2),
                    resultSet.getString(3)
               );
               answer.add(phongBan);
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
   
    public void addNewPhongBan(PhongBan phongBan) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_PHONGBAN);
            preparedStatement.setString(1, phongBan.getTenPhong());
            preparedStatement.setString(2, phongBan.getTenTruongPhong());
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
    
    public void updatePhongBanByID(PhongBan phongBan) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PHONGBAN);
            preparedStatement.setString(1, phongBan.getTenPhong());
            preparedStatement.setString(2, phongBan.getTenTruongPhong());
            preparedStatement.setLong(3, phongBan.getMaPhong());
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
    
    public void deletePhongBanByID(long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PHONGBAN);
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
