package model;

import java.util.Date;

public class BenhNhan {
    private String maBN;
    private String hoTen;
    private Date ngayDangKy;
    private String cccd;

    public BenhNhan() {
    }

    public BenhNhan(String maBN, String hoTen, Date ngayDangKy, String cccd) {
        this.maBN = maBN;
        this.hoTen = hoTen;
        this.ngayDangKy = ngayDangKy;
        this.cccd = cccd;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "maBN='" + maBN + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayDangKy='" + ngayDangKy + '\'' +
                ", cccd='" + cccd + '\'' +
                '}';
    }
}
