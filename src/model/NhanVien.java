package model;

public class NhanVien {
    private String hoTen;
    private String maNv;
    private double luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String maNv, double luongCoBan) {
        this.hoTen = hoTen;
        this.maNv = maNv;
        this.luongCoBan = luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void hienThiThongTin() {
        System.out.println( "NhanVien{" +
                "hoTen='" + hoTen + '\'' +
                ", maNv='" + maNv + '\'' +
                ", luongCoBan=" + luongCoBan +
                '}');
    }
}
