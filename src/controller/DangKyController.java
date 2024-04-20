package controller;

import model.TaiKhoan;
import util.KetNoiCSDL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DangKyController {
    private static final String findExistUser = "select count(*) from TAIKHOAN where taikhoan = ?";
    private static final String insertNewUser = "insert into TAIKHOAN(TAIKHOAN, MATKHAU, QUYEN) values(?,?,?)";
    
    public static String onRegisterEvent(TaiKhoan taikhoan) throws SQLException {
        try {
            Connection connection = KetNoiCSDL.getConnection();

            //Xử lý tìm tài khoản tồn tại
            PreparedStatement preparedStatement = connection.prepareStatement(findExistUser);
            preparedStatement.setString(1, taikhoan.getTaiKhoan());
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();//Chuyển con trỏ về bản ghi đầu
            int countRow = resultSet.getInt(1);

            if (countRow > 0) {
                throw new Exception("Tài Khoản Đã Tồn Tại");
            } else {
//                // chèn nhân viên 
//                PreparedStatement preparedStatement2 = connection.prepareStatement(insertNhanVien);
//                preparedStatement2.setLong(1, taikhoan.getMaTaiKhoan());
//                preparedStatement2.setString(2, "");
//                preparedStatement2.setInt(3, 0);
//                preparedStatement2.setDate(4, new Date(0));
//                preparedStatement2.setString(5, "");
//                preparedStatement2.setString(6, "");
//                preparedStatement2.setString(7, "");
//                preparedStatement2.setInt(8, 0);
//                preparedStatement2.setInt(9, 0);
//                preparedStatement2.setLong(10, taikhoan.getMaTaiKhoan());
//                preparedStatement2.executeUpdate();

                //Xử lý chèn tài khoản mới vào hệ thống
                PreparedStatement preparedStatement1 = connection.prepareStatement(insertNewUser);
                preparedStatement1.setString(1, taikhoan.getTaiKhoan());
                preparedStatement1.setString(2, taikhoan.getMatKhau());
                preparedStatement1.setInt(3, taikhoan.getQuyen());
                preparedStatement1.executeUpdate();

                return "Tạo Tài Khoản Thành Công";
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }
}
