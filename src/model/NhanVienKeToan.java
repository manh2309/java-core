package model;

import service.ChamCong;
import service.TinhLuong;

public class NhanVienKeToan extends NhanVien implements ChamCong, TinhLuong {
    private int soNgayCong;

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
        return soNgayCong * getLuongCoBan();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ch?c v?: K? To?n");
    }
}
