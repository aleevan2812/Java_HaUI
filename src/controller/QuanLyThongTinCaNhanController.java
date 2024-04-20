package controller;

import model.NhanVien;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.IUpdateTableEvent;

public class QuanLyThongTinCaNhanController {
    private static IUpdateTableEvent iUpdateTableEvent;
    private static final String ON_QUERY_USER_INFO = 
              "select TENNHANVIEN, GIOITINH, NGAYSINH, DIACHI, CHUCVU, TRINHDO "
            + "from NHANVIEN inner join TAIKHOAN on NHANVIEN.MATAIKHOAN = TAIKHOAN.MATAIKHOAN "
            + "where TAIKHOAN.MATAIKHOAN = ?;";
    private static final String ON_QUERY_USER_CHECK = 
            "select count(*) "
            + "from NHANVIEN inner join TAIKHOAN on NHANVIEN.MATAIKHOAN = TAIKHOAN.MATAIKHOAN "
            + "where TAIKHOAN.MATAIKHOAN = ?;";
    private static final String ON_QUERY_USER_CHECK_LUONG = 
            "select chamcong.macong,thang,nam,hesoluong,tienphucap,tienthuong "
            + "from chamcong inner join nhanvien on chamcong.manhanvien = nhanvien.manhanvien "
            + "inner join hesoluong on nhanvien.mahesoluong=nhanvien.mahesoluong "
            + "inner join danhsachphucap on chamcong.macong=danhsachphucap.macong "
            + "inner join phucap on danhsachphucap.maphucap=phucap.maphucap "
            + "inner join danhsachthuong on chamcong.macong=danhsachthuong.macong "
            + "inner join thuong on danhsachthuong.mathuong=thuong.mathuong ";
    private static final String ON_QUERY_USER_CHECK_TKLUONG = 
            "select nhanvien.manhanvien,tennhanvien,maphong,thang,nam,songaylamviec,sogiolamthem "
            + "from chamcong inner join nhanvien on chamcong.manhanvien = nhanvien.manhanvien ";      
   
     public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
   
    public ArrayList<String> onQueryAllUserCheckCaNhan(String queryString, boolean xth) throws SQLException{
        Connection connection = null;
        String queryStringstatic;
        if(xth == true) queryStringstatic= ON_QUERY_USER_CHECK_LUONG;
                else  queryStringstatic= ON_QUERY_USER_CHECK_TKLUONG;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(queryStringstatic+ queryString);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<String> answer= new ArrayList<String>();
            if(xth == true){
                while(resultSet.next()){
                answer.add(resultSet.getInt("macong")+","+
                            resultSet.getInt("thang")+","+
                        resultSet.getInt("nam")+","+
                        resultSet.getFloat("hesoluong")+","+
                        resultSet.getLong("tienphucap")+","+
                        resultSet.getLong("tienthuong"));
                }
            }
            else {
                while(resultSet.next()){
                answer.add(resultSet.getInt(1)+","+
                            resultSet.getString(2)+","+
                        resultSet.getInt(3)+","+
                        resultSet.getInt(4)+","+
                        resultSet.getInt(5)+","+
                        resultSet.getLong(6)+","+
                        resultSet.getLong(7));
                }
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
    
    
    public NhanVien onQueryUserInfo(long id) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ON_QUERY_USER_INFO);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            
            PreparedStatement preparedStatement1 = connection.prepareStatement(ON_QUERY_USER_CHECK);
            preparedStatement1.setLong(1, id);
            ResultSet resultSet1 = preparedStatement1.executeQuery();
            resultSet1.next();
            int check = resultSet1.getInt(1);
            NhanVien nhanVien = new NhanVien();
            if (check == 1) {
                nhanVien.setTenNhanVien(resultSet.getString(1));
                nhanVien.setGioiTinh(resultSet.getInt(2));
                nhanVien.setNgaySinh(new Date(resultSet.getDate(3).getTime()));
                nhanVien.setDiaChi(resultSet.getString(4));
                nhanVien.setChucVu(resultSet.getString(5));
                nhanVien.setTrinhDo(resultSet.getString(6));
            } else {
                nhanVien.setTenNhanVien("");
                nhanVien.setGioiTinh(0);
                nhanVien.setNgaySinh(new Date(0));
                nhanVien.setDiaChi("");
                nhanVien.setChucVu("");
                nhanVien.setTrinhDo("");
            }
            return nhanVien;
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
}
