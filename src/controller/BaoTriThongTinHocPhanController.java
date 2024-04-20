package controller;

import model.HocPhan;
import util.IUpdateTableEvent;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaoTriThongTinHocPhanController {
    private static final String QUERY_ALL_HOCPHAN = "select * from HocPhan";
    private static final String INSERT_NEW_HOCPHAN = "insert into HocPhan(TenHocPhan,SoTinChi) values(?,?)";
    private static final String UPDATE_HOCPHAN = "update HocPhan set TenHocPhan = ?, SoTinChi = ? where MaHocPhan = ?";
    private static final String DELETE_HOCPHAN = "delete from HocPhan where MaHocPhan = ?";
    private static final String QUERY_ALL_TENHOCPHAN = "select tenhocphan from HocPhan";
    private IUpdateTableEvent iUpdateTableEvent;
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
    public ArrayList<HocPhan> onQueryAllHocPhan() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL_HOCPHAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<HocPhan> answer= new ArrayList<>();
            
            while(resultSet.next()){
               HocPhan hocPhan = new HocPhan();
               hocPhan.setMaHocPhan(resultSet.getLong(1));
               hocPhan.setTenHocPhan(resultSet.getString(2));
               hocPhan.setSoTinChi(resultSet.getInt(3));
               answer.add(hocPhan);
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
    public ArrayList<String> onQueryAllTenHocPhan() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL_TENHOCPHAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<String> answer= new ArrayList<>();
            
            while(resultSet.next()){
               answer.add(resultSet.getString("tenhocphan"));
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
    
    public void addNewHocPhan(HocPhan hocPhan) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_HOCPHAN);
            preparedStatement.setString(1, hocPhan.getTenHocPhan());
            preparedStatement.setInt(2, hocPhan.getSoTinChi());
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
    
    public void updateHocPhanByID(HocPhan hocPhan) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HOCPHAN);
            preparedStatement.setString(1, hocPhan.getTenHocPhan());
            preparedStatement.setInt(2, hocPhan.getSoTinChi());
            preparedStatement.setLong(3, hocPhan.getMaHocPhan());
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
    
    public void deleteHocPhanByID(long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_HOCPHAN);
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
