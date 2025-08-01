package model;

import service.ChamCong;
import service.TinhLuong;

public class NhanVienLapTrinh extends NhanVien implements ChamCong, TinhLuong {
    int soGioOT;
    int soNgayCong;

    public int getSoGioOT() {
        return soGioOT;
    }

    public void setSoGioOT(int soGioOT) {
        this.soGioOT = soGioOT;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public int tinhNgayCong() {
        return soNgayCong;
    }

    @Override
    public double tinhLuong() {
        return (((double) soGioOT / 8) + soNgayCong) * getLuongCoBan();
    }
}
