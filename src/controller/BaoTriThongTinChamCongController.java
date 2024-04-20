package controller;

import model.ChamCong;
import util.IUpdateTableEvent;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class BaoTriThongTinChamCongController {
    private static IUpdateTableEvent iUpdateTableEvent;
    private static final String SELECT_ALL_ChAMCONG = "select * from chamcong";
    private static final String INSERT_ChAMCONG = "insert into chamcong(THANG, NAM, SONGAYLAMVIEC, SOGIOLAMTHEM, TIENUNGTRUOC, MANHANVIEN) values(?,?,?,?,?,?);";
    private static final String UPDATE_ChAMCONG = "update chamcong set THANG = ?, NAM = ?, SONGAYLAMVIEC=?, SOGIOLAMTHEM=?, TIENUNGTRUOC=?, MANHANVIEN=? "  + "where MACONG = ?";
    private static final String DELETE_ChAMCONG = "delete from chamcong where MACONG = ?";
    private static  final  String SELECT_MNV_ChAMCONG ="select distinct MANHANVIEN FROM chamcong WHERE MANHANVIEN = ?;";
    private static final  String INSERT_DSTHUONG="insert into danhsachthuong values (?,?); ";
    private static final  String INSERT_DSPHUCAP="insert into danhsachphucap values (?,?); ";
    private static final  String INSERT_DSHOCPHAN="insert into chamcong_hocphan values (?,?,?); ";
    private static final String UPDATE_DSTHUONG = "update danhsachthuong set MATHUONG=? "  + "where MACONG = ?";
    private static final String UPDATE_DSPHUCAP = "update danhsachphucap set MAPHUCAP=? "  + "where MACONG = ?";
    private static final String UPDATE_DSHOCPHAN = "update chamcong_hocphan set SOTIET=?, MAHOCPHAN=? "  + "where MACONG = ?";
    private static final String SELECT_ALL_DSTHUONG = "select mathuong from danhsachthuong where macong = ?";
    private static final String SELECT_ALL_DSPHUCAP = "select maphucap from danhsachphucap where macong = ?";
    private static final String SELECT_ALL_DSHOCPHAN = "select mahocphan, sotiet from chamcong_hocphan where macong = ?";
    private static final String DELETE_DSTHUONG = "delete from danhsachthuong where MACONG = ?";
    private static final String DELETE_DSTPHUCAP = "delete from danhsachphucap where MACONG = ?";
    private static final String DELETE_DSHOCPHAN = "delete from chamcong_hocphan where MACONG = ?";
   
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    
    public ArrayList<ChamCong> onQueryAllChamCongs() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ChAMCONG);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<ChamCong> answer= new ArrayList<>();
            
            while(resultSet.next()){
                ChamCong chamCong = new ChamCong(
                    resultSet.getLong(1),
                    resultSet.getInt(2),
                    resultSet.getInt(3),
                    resultSet.getInt(4),
                    resultSet.getInt(5),
                    resultSet.getLong(6),
                    resultSet.getLong(7)
                );
                answer.add(chamCong);
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
    
     public Long onQueryMaChamCong(String employeeCode) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MNV_ChAMCONG);
             preparedStatement.setLong(1, Integer.parseInt(employeeCode));
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
            // Di chuyển con trỏ đến dòng đầu tiên của ResultSet
            return resultSet.getLong("MANHANVIEN");
        } else {
            return null; // Hoặc giá trị mặc định phù hợp với ứng dụng của bạn
        }
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
     
    public ArrayList<String> onQueryAllDS(String MaCong,String xd) throws SQLException{
        Connection connection = null;
        String queryString="", string="", string1="";
        switch (xd) {
            case "dsthuong":
                queryString =SELECT_ALL_DSTHUONG;
                string="Mã thưởng ";
                string1="mathuong";
                break;
            case "dshocphan":
                queryString=SELECT_ALL_DSHOCPHAN;
                string="MaHP ";
                break;
            case "dsphucap":
                queryString= SELECT_ALL_DSPHUCAP;
                string="Mã phụ cấp ";
                string1="maphucap";
                break;
            default:
                break;
        }
        try {
            
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
             preparedStatement.setLong(1, Integer.parseInt(MaCong));
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<String> answer= new ArrayList<>();
            if(string.equals("MaHP ")){
                while(resultSet.next()){
                int mhp= resultSet.getInt("mahocphan");
                int sotiet=resultSet.getInt("sotiet");
                answer.add(string+mhp+", Số tiết "+sotiet);
                }
            }else{
                while(resultSet.next()){
                int ma= resultSet.getInt(string1);
                answer.add(string+ma);
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
    
    public void addChamCong(ChamCong chamCong) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ChAMCONG, new String[] {"MACONG"});
            preparedStatement.setInt(1, chamCong.getThang());
            preparedStatement.setInt(2, chamCong.getNam());
            preparedStatement.setInt(3, chamCong.getSoNgayLamViec());
            preparedStatement.setInt(4, chamCong.getSoGioLamThem());
            preparedStatement.setLong(5, chamCong.getTienUngTruoc());
            preparedStatement.setLong(6, chamCong.getMaNhanVien());
            int answer = preparedStatement.executeUpdate();
            int generatedId=-1;
             try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                generatedId = generatedKeys.getInt(1); // Lấy giá trị "id" từ ResultSet
                System.out.println("Giá trị tự động tăng (id): " + generatedId);
            } else {
                System.err.println("Không lấy được giá trị tự động tăng.");
            }
            }
            ArrayList<String> dsth=chamCong.getDanhSachThuong();
            for (int i = 0; i < dsth.size(); i++) {
                preparedStatement = connection.prepareStatement(INSERT_DSTHUONG);
                preparedStatement.setInt(1, Integer.parseInt(dsth.get(i).substring(dsth.get(i).lastIndexOf(" ")+1)));
                preparedStatement.setInt(2, generatedId);
                answer = preparedStatement.executeUpdate();
            }
            ArrayList<String> dsth1=chamCong.getDanhSachPhuCap();
            for (int i = 0; i < dsth1.size(); i++) {
                preparedStatement = connection.prepareStatement(INSERT_DSPHUCAP);
                preparedStatement.setInt(1, Integer.parseInt(dsth1.get(i).substring(dsth1.get(i).lastIndexOf(" ")+1)));
                preparedStatement.setLong(2, generatedId);
                answer = preparedStatement.executeUpdate();
            } 
            
            ArrayList<String> dsth2=chamCong.getDanhSachHocPhan();
            for (int i = 0; i < dsth2.size(); i++) {
                preparedStatement = connection.prepareStatement(INSERT_DSHOCPHAN);
                preparedStatement.setInt(1, generatedId);
                preparedStatement.setInt(2, Integer.parseInt(dsth2.get(i).substring(5,dsth2.get(i).indexOf(","))));
                preparedStatement.setInt(3, Integer.parseInt(dsth2.get(i).substring(dsth2.get(i).lastIndexOf(" ")+1)));
                answer = preparedStatement.executeUpdate();
            } 
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void modifyHeSoLuongByID(ChamCong chamCong) throws SQLException{
        Connection connection = null;
        try {
            
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ChAMCONG);
            preparedStatement.setInt(1, chamCong.getThang());
            preparedStatement.setInt(2, chamCong.getNam());
            preparedStatement.setInt(3, chamCong.getSoNgayLamViec());
            preparedStatement.setInt(4, chamCong.getSoGioLamThem());
            preparedStatement.setLong(5, chamCong.getTienUngTruoc());
            preparedStatement.setLong(6, chamCong.getMaNhanVien());
            preparedStatement.setLong(7, chamCong.getMaCong());
            int answer = preparedStatement.executeUpdate();
            
             ArrayList<String> dsth=chamCong.getDanhSachThuong();
             if(dsth != null){
                for (int i = 0; i < dsth.size(); i++) {
                    preparedStatement = connection.prepareStatement(UPDATE_DSTHUONG);
                    preparedStatement.setInt(1, Integer.parseInt(dsth.get(i).substring(dsth.get(i).lastIndexOf(" ")+1)));
                    preparedStatement.setLong(2, chamCong.getMaCong());
                    answer = preparedStatement.executeUpdate();
                }
             }
             
            ArrayList<String> dsth1=chamCong.getDanhSachPhuCap();
            
            if(dsth1 != null){
            for (int i = 0; i < dsth1.size(); i++) {
                preparedStatement = connection.prepareStatement(UPDATE_DSPHUCAP);
                preparedStatement.setInt(1, Integer.parseInt(dsth1.get(i).substring(dsth1.get(i).lastIndexOf(" ")+1)));
                preparedStatement.setLong(2, chamCong.getMaCong());
                answer = preparedStatement.executeUpdate();
            } 
            }
            
            ArrayList<String> dsth2=chamCong.getDanhSachHocPhan();
            
            if(dsth2 != null){
            for (int i = 0; i < dsth2.size(); i++) {
                preparedStatement = connection.prepareStatement(UPDATE_DSHOCPHAN);
                preparedStatement.setInt(1, Integer.parseInt(dsth2.get(i).substring(dsth2.get(i).lastIndexOf(" ")+1)));
                preparedStatement.setInt(2, Integer.parseInt(dsth2.get(i).substring(5,dsth2.get(i).indexOf(","))));
                preparedStatement.setLong(3, chamCong.getMaCong());
                answer = preparedStatement.executeUpdate();
            } 
            }
            iUpdateTableEvent.onUpdateDataOnTableEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void deleteChamCongByID(long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_DSTHUONG);
            preparedStatement.setLong(1, ID);
            int answer = preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement(DELETE_DSTPHUCAP);
            preparedStatement.setLong(1, ID);
            answer = preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement(DELETE_DSHOCPHAN);
            preparedStatement.setLong(1, ID);
            answer = preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement(DELETE_ChAMCONG);
            preparedStatement.setLong(1, ID);
            answer = preparedStatement.executeUpdate();
            
           
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
