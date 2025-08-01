import model.NhanVien;
import model.NhanVienKeToan;
import model.NhanVienLapTrinh;
import service.TinhLuong;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NhanVien> nhanViens = new ArrayList<>();

        NhanVienKeToan nhanVienKeToan = new NhanVienKeToan();
        nhanVienKeToan.setLuongCoBan(8000000);
        nhanVienKeToan.setHoTen("Nguyen Van A");
        nhanVienKeToan.setMaNv("a1");
        nhanVienKeToan.setSoNgayCong(22);

        NhanVienLapTrinh nhanVienLapTrinh = new NhanVienLapTrinh();
        nhanVienLapTrinh.setLuongCoBan(9000000);
        nhanVienLapTrinh.setHoTen("Nguyen Van B");
        nhanVienLapTrinh.setMaNv("a2");
        nhanVienLapTrinh.setSoNgayCong(22);
        nhanVienLapTrinh.setSoGioOT(8);

        nhanViens.add(nhanVienKeToan);
        nhanViens.add(nhanVienLapTrinh);

        for (NhanVien nv : nhanViens) {
            nv.hienThiThongTin();
            if (nv instanceof TinhLuong) {
                double luong = ((TinhLuong) nv).tinhLuong();
                System.out.println("Tinh luong: " + luong);
            }
        }
    }
}