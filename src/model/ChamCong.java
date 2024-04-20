package model;

import java.util.ArrayList;

public class ChamCong extends BaseModel {
    private long maCong;
    private int thang;
    private int nam;
    private int soNgayLamViec;
    private int soGioLamThem;
    private long tienUngTruoc;
    private long maNhanVien;

    
    private ArrayList<String> danhSachThuong;
    private ArrayList<String> danhSachHocPhan;
    private ArrayList<String> danhSachPhuCap;

    public ChamCong() {
    }
    public ChamCong(ArrayList<String> danhSachThuong, 
                    ArrayList<String> danhSachPhuCap,
                    ArrayList<String> danhSachHocPhan) {
        this.danhSachThuong=danhSachThuong;
        this.danhSachPhuCap=danhSachPhuCap;
        this.danhSachHocPhan=danhSachHocPhan;
        
    }
     public ChamCong(long maCong,int thang, 
                    int nam, int soNgayLamViec, 
                    int soGioLamThem, long tienUngTruoc,
                    long maNhanVien) {
        this.maCong=maCong;
        this.thang = thang;
        this.nam = nam;
        this.soNgayLamViec = soNgayLamViec;
        this.soGioLamThem = soGioLamThem;
        this.tienUngTruoc = tienUngTruoc;
        this.maNhanVien=maNhanVien;
    }
    public ChamCong(long maCong,int thang, 
                    int nam, int soNgayLamViec, 
                    int soGioLamThem, long tienUngTruoc,
                    long maNhanVien,
                    ArrayList<String> danhSachThuong, 
                    ArrayList<String> danhSachPhuCap,
                    ArrayList<String> danhSachHocPhan) {
        this.maCong=maCong;
        this.thang = thang;
        this.nam = nam;
        this.soNgayLamViec = soNgayLamViec;
        this.soGioLamThem = soGioLamThem;
        this.tienUngTruoc = tienUngTruoc;
        this.maNhanVien=maNhanVien;
         this.danhSachThuong=danhSachThuong;
        this.danhSachPhuCap=danhSachPhuCap;
        this.danhSachHocPhan=danhSachHocPhan;
    }
    
    public ChamCong(int thang, int nam, 
                    int soNgayLamViec, int soGioLamThem, 
                    long tienUngTruoc,long maNhanVien) {
        this.thang = thang;
        this.nam = nam;
        this.soNgayLamViec = soNgayLamViec;
        this.soGioLamThem = soGioLamThem;
        this.tienUngTruoc = tienUngTruoc;
        this.maNhanVien=maNhanVien;;
    }
    public long getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(long maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public long getMaCong() {
        return maCong;
    }

    public void setMaCong(int maChamCong) {
        this.maCong = maChamCong;
    }
    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public long getTienUngTruoc() {
        return tienUngTruoc;
    }

    public void setTienUngTruoc(long tienUngTruoc) {
        this.tienUngTruoc = tienUngTruoc;
    }

    public ArrayList<String> getDanhSachThuong() {
        return danhSachThuong;
    }

    public void setDanhSachThuong(ArrayList<String> danhSachThuong) {
        this.danhSachThuong = danhSachThuong;
    }

    public ArrayList<String> getDanhSachHocPhan() {
        return danhSachHocPhan;
    }

    public void setDanhSachHocPhan(ArrayList<String> danhSachHocPhan) {
        this.danhSachHocPhan = danhSachHocPhan;
    }

    public ArrayList<String> getDanhSachPhuCap() {
        return danhSachPhuCap;
    }

    public void setDanhSachPhuCap(ArrayList<String> danhSachPhuCap) {
        this.danhSachPhuCap = danhSachPhuCap;
    }
    
    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[7];
        answer[0] = maCong;
        answer[1] = thang;
        answer[2] = nam;
        answer[3]=soNgayLamViec;
        answer[4]=soGioLamThem;
        answer[5]=tienUngTruoc;
        answer[6]=maNhanVien;
        return answer;
    }

}
