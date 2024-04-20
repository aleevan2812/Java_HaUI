package model;

public class PhongBan extends BaseModel{
    private long maPhong;
    private String tenPhong;
    private String tenTruongPhong;

    public PhongBan() {
    }

    public PhongBan(long maPhong, String tenPhong, String tenTruongPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.tenTruongPhong = tenTruongPhong;
    }

    public long getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(long maPhong) {
        this.maPhong = maPhong;
    }

    

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getTenTruongPhong() {
        return tenTruongPhong;
    }

    public void setTenTruongPhong(String tenTruongPhong) {
        this.tenTruongPhong = tenTruongPhong;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[3];
        answer[0] = maPhong;
        answer[1] = tenPhong;
        answer[2] = tenTruongPhong;
        return answer;
    }

    @Override
    public String toString() {
        return getTenPhong();
    }
    
    
}
