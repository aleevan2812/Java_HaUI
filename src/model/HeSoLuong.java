package model;

public class HeSoLuong extends BaseModel{
    private long maHeSoLuong;
    private String tenHeSoLuong;
    private float heSoLuong;

    public HeSoLuong() {
    }

    public HeSoLuong(String tenHeSoLuong, float heSoLuong) {
        this.tenHeSoLuong = tenHeSoLuong;
        this.heSoLuong = heSoLuong;
    }
    
    
    public HeSoLuong(long maHeSoLuong, String tenHeSoLuong, float heSoLuong) {
        this.maHeSoLuong = maHeSoLuong;
        this.tenHeSoLuong = tenHeSoLuong;
        this.heSoLuong = heSoLuong;
    }

    public long getMaHeSoLuong() {
        return maHeSoLuong;
    }
    
    
    public String getTenHeSoLuong() {
        return tenHeSoLuong;
    }

    public void setTenHeSoLuong(String tenHeSoLuong) {
        this.tenHeSoLuong = tenHeSoLuong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }


    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[3];
        answer[0] = maHeSoLuong;
        answer[1] = tenHeSoLuong;
        answer[2] = heSoLuong;
        return answer;
    }

    @Override
    public String toString() {
        return String.valueOf(heSoLuong);
    }
}
