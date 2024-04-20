package controller;

import model.PhuCap;
import util.IUpdateTableEvent;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaoTriThongTinPhuCapController {
    private static final String QUERY_ALL_PHUCAP = "select * from PHUCAP";
    private static final String INSERT_NEW_PHUCAP = "insert into PHUCAP(TENPHUCAP, TIENPHUCAP) values(?,?)";
    private static final String UPDATE_PHUCAP = "update PHUCAP set TENPHUCAP = ?, TIENPHUCAP = ? where MAPHUCAP = ?";
    private static final String DELETE_PHUCAP = "delete from PHUCAP where MAPHUCAP = ?";
    private IUpdateTableEvent iUpdateTableEvent;
    
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
    public ArrayList<PhuCap> onQueryAllPhuCap() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL_PHUCAP);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<PhuCap> answer= new ArrayList<>();
            
            while(resultSet.next()){
               PhuCap phuCap = new PhuCap();
               phuCap.setMaPhuCap(resultSet.getLong(1));
               phuCap.setTenPhuCap(resultSet.getString(2));
               phuCap.setTienPhuCap(resultSet.getLong(3));
               answer.add(phuCap);
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
    
    public void addNewPhuCap(PhuCap phuCap) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_PHUCAP);
            preparedStatement.setString(1, phuCap.getTenPhuCap());
            preparedStatement.setLong(2, phuCap.getTienPhuCap());
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
    
    public void updatePhuCapByID(PhuCap phuCap) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PHUCAP);
            preparedStatement.setString(1, phuCap.getTenPhuCap());
            preparedStatement.setLong(2, phuCap.getTienPhuCap());
            preparedStatement.setLong(3, phuCap.getMaPhuCap());
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
    
    public void deletePhuCapByID(long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PHUCAP);
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
