package controller;

import model.TaiKhoan;
import view.TrangChu.TrangChuAdmin.TrangChuAdminUI;
import view.TrangChu.TrangChuGiamDoc.TrangChuGiamDocUI;
import view.TrangChu.TrangChuKeToan.TrangChuKeToanUI;
import view.TrangChu.TrangChuNguoiDung.TrangChuNguoiDungUI;
import view.TrangChu.TrangChuNhanSu.TrangChuNhanSuUI;
import util.KetNoiCSDL;
import util.XuLyFile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class DangNhapController {

    private static final String findExistUser
            = "select count(*) from TAIKHOAN where taikhoan = ? and matkhau = ?";

    private static final String quyenNguoiDung
            = "select mataikhoan, taikhoan, quyen from taikhoan "
            + "where taikhoan = ? and matkhau = ?";
    
    public static String onLoginEvent(TaiKhoan taiKhoan) {
        try {
            Connection connection = KetNoiCSDL.getConnection();
            //Xử lý tìm tài khoản tồn tại
            PreparedStatement preparedStatement = connection.prepareStatement(findExistUser);
            preparedStatement.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement.setString(2, taiKhoan.getMatKhau());
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();//Chuyển con trỏ về bản ghi đầu
            int countRow = resultSet.getInt(1);

            if (countRow != 1) {
                throw new Exception("Tài Khoản Không Tồn Tại");
            }

            //Mở giao diện các theo quyền
            PreparedStatement preparedStatement1 = connection.prepareStatement(quyenNguoiDung);
            preparedStatement1.setString(1, taiKhoan.getTaiKhoan());
            preparedStatement1.setString(2, taiKhoan.getMatKhau());

            ResultSet resultSet1 = preparedStatement1.executeQuery();
            resultSet1.next();
            int ID = resultSet1.getInt(1);
            XuLyFile.luuIDTaiKhoan(ID);
            String tenTaiKhoan = resultSet1.getString(2);
            int quyen = resultSet1.getInt(3);

            HashMap<String, Object> data = new HashMap<>();
            data.put("TenTaiKhoan", tenTaiKhoan);
            data.put("ID", ID);
            data.put("Quyen", quyen);
            switch (quyen) {
                case 0 -> {
                    TrangChuAdminUI trangChuAdminUI = new TrangChuAdminUI(data);
                    trangChuAdminUI.onStartGUI();
                }
                
                case 1 -> {
                    TrangChuNguoiDungUI trangChuNguoiDungUI = new TrangChuNguoiDungUI(data);
                    trangChuNguoiDungUI.onStartGUI();
                }
                
                case 2 -> {
                    TrangChuKeToanUI trangChuKeToanUI = new TrangChuKeToanUI(data);
                    trangChuKeToanUI.onStartGUI();
                }
                
                case 3 -> {
                    TrangChuNhanSuUI trangChuNhanSuUI = new TrangChuNhanSuUI(data);
                    trangChuNhanSuUI.onStartGUI();
                }
                
                case 4 -> {
                    TrangChuGiamDocUI trangChuGiamDocUI = new TrangChuGiamDocUI(data);
                    trangChuGiamDocUI.onStartGUI();
                }
            }
            return "Đăng Nhập Thành Công";
        } catch (Exception ex) {
            return ex.toString();
        }
    }
}
