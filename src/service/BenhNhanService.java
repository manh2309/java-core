package service;

import model.BenhNhan;

import java.util.*;

public class BenhNhanService {

    private List<BenhNhan> danhSach;

    public BenhNhanService() {
        this.danhSach = new ArrayList<>();
    }

    public void addBenhNhan(BenhNhan benhNhan) {
        this.danhSach.add(benhNhan);
    }

    public void timKiemBenhNhanTheoCCCD(String cccd) {
        this.danhSach.stream()
                .filter(benhNhan -> benhNhan.getCccd().equals(cccd))
                .forEach(System.out::println);
    }

    public void xoaBenhNhanTheoCCCD(String cccd) {
        this.danhSach.removeIf(bnhNhan -> bnhNhan.getCccd().equals(cccd));
    }

    public void hienThiDanhSach() {
        this.danhSach.stream().forEach(bnhNhan -> System.out.println(bnhNhan));
    }

    public void sapXepTheoTen() {
        this.danhSach.sort(Comparator.comparing(BenhNhan::getHoTen));
    }


    public BenhNhan nhapBenhNhanTuBanPhim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh?p ma: ");
        String maBN = sc.nextLine();
        System.out.print("Nh?p ten: ");
        String name = sc.nextLine();
        System.out.print("Nh?p CCCD: ");
        String cccd = sc.nextLine();

        Date ngayDangKy = new Date();
        BenhNhan p = new BenhNhan();
        p.setMaBN(maBN);
        p.setHoTen(name);
        p.setNgayDangKy(ngayDangKy);
        p.setCccd(cccd);
        return p;
    }
}
