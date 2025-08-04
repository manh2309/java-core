package model;

import java.io.Serializable;
import java.util.Date;

public class Patient extends Person  implements Comparable<Patient>, Serializable {
    private String benhLi;
    private Date ngayDangKy;

    public Patient() {

    }
    public Patient(String benhLi, Date ngayDangKy) {
        this.benhLi = benhLi;
        this.ngayDangKy = ngayDangKy;
    }

    public Patient(int id, String name, String cccd, String benhLi, Date ngayDangKy) {
        super(id, name, cccd);
        this.benhLi = benhLi;
        this.ngayDangKy = ngayDangKy;
    }

    public String getBenhLi() {
        return benhLi;
    }

    public void setBenhLi(String benhLi) {
        this.benhLi = benhLi;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    @Override
    public int compareTo(Patient o) {
        return this.ngayDangKy.compareTo(o.ngayDangKy);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "hoTen='" + getName() + '\'' +
                ", cccd='" + getCccd() + '\'' +
                ", benhLi='" + benhLi + '\'' +
                ", ngayDangKy=" + ngayDangKy +
                '}';
    }
}
