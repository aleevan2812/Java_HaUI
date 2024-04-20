package model;

import java.sql.Date;

public class NhanVien extends BaseModel{
    protected long maNhanVien;
    protected String tenNhanVien;
    protected int gioiTinh;
    protected Date ngaySinh;
    protected String diaChi;
    protected String chucVu;
    protected String trinhDo;
    protected long maTaiKhoan;
    protected long maPhongBan;
    protected long maHeSoLuong;

    public NhanVien() {
    }

    public long getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(long maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public long getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(long maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public long getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(long maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public long getMaHeSoLuong() {
        return maHeSoLuong;
    }

    public void setMaHeSoLuong(long maHeSoLuong) {
        this.maHeSoLuong = maHeSoLuong;
    }

    public NhanVien(long maNhanVien, String tenNhanVien, int gioiTinh, Date ngaySinh, String diaChi, String chucVu, String trinhDo, long maTaiKhoan, long maPhongBan, long maHeSoLuong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.trinhDo = trinhDo;
        this.maTaiKhoan = maTaiKhoan;
        this.maPhongBan = maPhongBan;
        this.maHeSoLuong = maHeSoLuong;
    }

    @Override
    public Object[] toObjectArrayData() {
       return null;
    }   

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", chucVu=" + chucVu + ", trinhDo=" + trinhDo + ", maTaiKhoan=" + maTaiKhoan + ", maPhongBan=" + maPhongBan + ", maHeSoLuong=" + maHeSoLuong + '}';
    }
}
