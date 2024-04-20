package model;

import java.sql.Date;

public class NhanVienDTO extends NhanVien {
    private String tenTaiKhoan;
    private String tenPhongBan;
    private float heSoLuong;

    public NhanVienDTO() {
        super();
    }

    public NhanVienDTO(String tenTaiKhoan, String tenPhongBan, float heSoLuong, long maNhanVien, String tenNhanVien, int gioiTinh, Date ngaySinh, String diaChi, String chucVu, String trinhDo, long maTaiKhoan, long maPhongBan, long maHeSoLuong) {
        super(maNhanVien, tenNhanVien, gioiTinh, ngaySinh, diaChi, chucVu, trinhDo, maTaiKhoan, maPhongBan, maHeSoLuong);
        this.tenTaiKhoan = tenTaiKhoan;
        this.tenPhongBan = tenPhongBan;
        this.heSoLuong = heSoLuong;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[10];
        answer[0] = maNhanVien;
        answer[1] = tenNhanVien;
        answer[2] = (gioiTinh == 0) ? "Nam" : "Nữ";
        answer[3] = ngaySinh;
        answer[4] = diaChi;
        answer[5] = chucVu;
        answer[6] = trinhDo;
        answer[7] = tenTaiKhoan;
        answer[8] = heSoLuong;
        answer[9] = tenPhongBan;
        return answer;
    }

    @Override
    public String toString() {
        return super.toString() +"\n" + "NhanVienDTO{" + "tenTaiKhoan=" + tenTaiKhoan + ", tenPhongBan=" + tenPhongBan + ", heSoLuong=" + heSoLuong + '}';
    }
}
