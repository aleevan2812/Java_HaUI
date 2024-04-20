package controller;

import model.HeSoLuong;
import util.IUpdateTableEvent;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaoTriThongTinHeSoLuongController {
    private static IUpdateTableEvent iUpdateTableEvent;
    private static final String SELECT_ALL_HESOLUONG = "select * from HeSoLuong";
    private static final String INSERT_HESOLUONG = "insert into HeSoLuong(TenHeSoLuong, HeSoLuong) values(?, ?);";
    private static final String UPDATE_HESOLUONG = "update HeSoLuong set TenHeSoLuong = ?, HeSoLuong = ? "
            + "where MaHeSoLuong = ?";
    private static final String DELETE_HESOLUONG = "delete from HeSoLuong where MaHeSoLuong = ?";
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
    public ArrayList<HeSoLuong> onQueryAllHeSoLuong() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_HESOLUONG);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<HeSoLuong> answer= new ArrayList<>();
            
            while(resultSet.next()){
                HeSoLuong heSoLuong = new HeSoLuong(
                     resultSet.getLong(1),
                     resultSet.getString(2),
                     resultSet.getFloat(3)
                );
                answer.add(heSoLuong);
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
    
    public void addHeSoLuong(HeSoLuong heSoLuong) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_HESOLUONG);
            preparedStatement.setString(1, heSoLuong.getTenHeSoLuong());
            preparedStatement.setFloat(2, heSoLuong.getHeSoLuong());
            int answer = preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection != null){
                connection.close();
            }
        }
    }
   
    public void modifyHeSoLuongByID(String tenHeSoLuong, float heSoLuong, long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HESOLUONG);
            preparedStatement.setString(1, tenHeSoLuong);
            preparedStatement.setFloat(2, heSoLuong);
            preparedStatement.setLong(3, ID);
            
            int answer = preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void deleteHeSoLuongByID(long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_HESOLUONG);
            preparedStatement.setLong(1, ID);
            int answer = preparedStatement.executeUpdate();
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection != null){
                connection.close();
            }
        }
    }
}
