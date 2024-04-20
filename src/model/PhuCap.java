package model;

public class PhuCap extends BaseModel{
    private long maPhuCap;
    private String tenPhuCap;
    private long tienPhuCap;
    
    public PhuCap() {
    }

    public PhuCap(String tenPhuCap, long tienPhuCap) {
        this.tenPhuCap = tenPhuCap;
        this.tienPhuCap = tienPhuCap;
    }

    public PhuCap(long maPhuCap, String tenPhuCap, long tienPhuCap) {
        this.maPhuCap = maPhuCap;
        this.tenPhuCap = tenPhuCap;
        this.tienPhuCap = tienPhuCap;
    }

    public long getMaPhuCap() {
        return maPhuCap;
    }

    public void setMaPhuCap(long maPhuCap) {
        this.maPhuCap = maPhuCap;
    }
    
    
    public String getTenPhuCap() {
        return tenPhuCap;
    }

    public void setTenPhuCap(String tenPhuCap) {
        this.tenPhuCap = tenPhuCap;
    }

    public long getTienPhuCap() {
        return tienPhuCap;
    }

    public void setTienPhuCap(long tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] objects = new Object[3];
        objects[0] = maPhuCap;
        objects[1] = tenPhuCap;
        objects[2] = tienPhuCap;
        return objects;
    }
}
