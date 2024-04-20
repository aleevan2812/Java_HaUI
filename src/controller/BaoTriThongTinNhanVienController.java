package controller;

import model.HeSoLuong;
import model.NhanVien;
import model.NhanVienDTO;
import model.PhongBan;
import util.IUpdateTableEvent;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BaoTriThongTinNhanVienController {
    private static IUpdateTableEvent iUpdateTableEvent;
    
    public void setUpdateTableEvent(IUpdateTableEvent iUpdateTableEvent) {
        this.iUpdateTableEvent = iUpdateTableEvent;
    }
    private static final String SELECT_ALL_NHANVIEN_INFO = "select MANHANVIEN, TENNHANVIEN, GIOITINH, NGAYSINH, DIACHI, CHUCVU, TRINHDO, TAIKHOAN, HESOLUONG, TENPHONG from NhanVien left join TAIKHOAN on NhanVien.MaTaiKhoan = TaiKhoan.MaTaiKhoan left join HeSoLuong on NhanVien.MaHeSoLuong = HeSoLuong.MaHeSoLuong left join PhongBan on NhanVien.MaPhong = PhongBan.MaPhong";
    private static final String INSERT_NEW_NHANVIEN = "insert into NHANVIEN(TENNHANVIEN, GIOITINH, NGAYSINH, DIACHI, CHUCVU, TRINHDO, MAPHONG, MAHESOLUONG, MATAIKHOAN) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_NHANVIEN = "update NHANVIEN set TENNHANVIEN = ?, GIOITINH = ?, NGAYSINH = ?, DIACHI = ?, CHUCVU = ?, TRINHDO = ?, MAPHONG = ?, MAHESOLUONG = ?, MATAIKHOAN = ? where MANHANVIEN = ?";
    private static final String DELETE_NHANVIEN = "delete from NHANVIEN where MaNhanVien = ?";
    private static final String ON_QUERY_ALLNHANSU = 
            "select nhanvien.manhanvien,tennhanvien,tenphong,hesoluong,tienphucap,tienthuong "
            + "from chamcong inner join nhanvien on chamcong.manhanvien = nhanvien.manhanvien "
            + "inner join hesoluong on nhanvien.mahesoluong=nhanvien.mahesoluong "
            + "inner join danhsachphucap on chamcong.macong=danhsachphucap.macong "
            + "inner join phucap on danhsachphucap.maphucap=phucap.maphucap "
            + "inner join danhsachthuong on chamcong.macong=danhsachthuong.macong "
            + "inner join thuong on danhsachthuong.mathuong=thuong.mathuong "
            + "inner join phongban on nhanvien.maphong=phongban.maphong ";
    
    public ArrayList<String> onQueryAllNhansu() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ON_QUERY_ALLNHANSU);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            ArrayList<String> answer= new ArrayList<String>();
                while(resultSet.next()){
                answer.add(resultSet.getInt("manhanvien")+","+
                            resultSet.getString("tennhanvien")+","+
                        resultSet.getString("tenphong")+","+
                        resultSet.getFloat("hesoluong")+","+
                        resultSet.getLong("tienphucap")+","+
                        resultSet.getLong("tienthuong"));
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
    
    public ArrayList<NhanVienDTO> onQueryAllTableNhanVien() throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_NHANVIEN_INFO);
            ResultSet resultSet = preparedStatement.executeQuery();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-M-dd");
            
            ArrayList<NhanVienDTO> answer = new ArrayList<>();
            
            while (resultSet.next()) {
                var nhanVien = new NhanVienDTO();
                nhanVien.setMaNhanVien(resultSet.getLong(1));
                nhanVien.setTenNhanVien(resultSet.getString(2));
                nhanVien.setGioiTinh(resultSet.getInt(3));
                nhanVien.setNgaySinh(resultSet.getDate(4));
                nhanVien.setDiaChi(resultSet.getString(5));
                nhanVien.setChucVu(resultSet.getString(6));
                nhanVien.setTrinhDo(resultSet.getString(7));
                nhanVien.setTenTaiKhoan(resultSet.getString(8) == null ? "Không có" : resultSet.getString(8));
                nhanVien.setHeSoLuong(resultSet.getFloat(9));
                nhanVien.setTenPhongBan(resultSet.getString(10) == null ? "Không có" : resultSet.getString(10));
                answer.add(nhanVien);
                
            }
            
            return answer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public ArrayList<PhongBan> onWriteComboBoxPhongBan() throws SQLException{
        return new BaoTriThongTinPhongBanController().onQueryAllPhongBan();
    }
    
    public ArrayList<HeSoLuong> onWriteComboBoxHeSoLuong() throws SQLException{
        return new BaoTriThongTinHeSoLuongController().onQueryAllHeSoLuong();
    }
    
    public long onFindAccountID(String tenTaiKhoan) throws SQLException{
        return new BaoTriThongTinTaiKhoanController().onFindTaiKhoanID(tenTaiKhoan);
    }
    
    public void addNhanVien(NhanVien nhanVien) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_NHANVIEN);
            preparedStatement.setString(1, nhanVien.getTenNhanVien());
            preparedStatement.setInt(2, nhanVien.getGioiTinh());
            preparedStatement.setDate(3, nhanVien.getNgaySinh());
            preparedStatement.setString(4, nhanVien.getDiaChi());
            preparedStatement.setString(5, nhanVien.getChucVu());
            preparedStatement.setString(6, nhanVien.getTrinhDo());
            preparedStatement.setLong(7, nhanVien.getMaPhongBan());
            preparedStatement.setLong(8, nhanVien.getMaHeSoLuong());
            preparedStatement.setLong(9, nhanVien.getMaTaiKhoan());
            preparedStatement.executeUpdate(); 
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
               
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void modifyNhanVienByID(NhanVien nhanVien) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_NHANVIEN);
            preparedStatement.setString(1, nhanVien.getTenNhanVien());
            preparedStatement.setInt(2, nhanVien.getGioiTinh());
            preparedStatement.setDate(3, nhanVien.getNgaySinh());
            preparedStatement.setString(4, nhanVien.getDiaChi());
            preparedStatement.setString(5, nhanVien.getChucVu());
            preparedStatement.setString(6, nhanVien.getTrinhDo());
            preparedStatement.setLong(7, nhanVien.getMaPhongBan());
            preparedStatement.setLong(8, nhanVien.getMaHeSoLuong());
            preparedStatement.setLong(9, nhanVien.getMaTaiKhoan());
            preparedStatement.setLong(10, nhanVien.getMaNhanVien());
            preparedStatement.executeUpdate();   
            
            iUpdateTableEvent.onUpdateDataOnTableEvent();
             
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                connection.close();
            }
        }
    }
    
    public void deleteNhanVienByID(long ID) throws SQLException{
        Connection connection = null;
        try {
            connection = KetNoiCSDL.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_NHANVIEN);
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
