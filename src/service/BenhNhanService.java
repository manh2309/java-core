package service;

import model.BenhNhan;
import repository.BenhNhanRepository;

import java.util.*;

public class BenhNhanService {
    private BenhNhanRepository repository = new BenhNhanRepository();
    private String FILE_PATH = "data/benhnhan.json";
    private List<BenhNhan> danhSach;

    public BenhNhanService() {
        this.danhSach = repository.readFromFile(FILE_PATH);
    }

    public void addBenhNhan(BenhNhan benhNhan) {
        this.danhSach.add(benhNhan);
        repository.saveToFile(danhSach, FILE_PATH);
    }

    public void timKiemBenhNhanTheoCCCD(String cccd) {
        this.danhSach.stream()
                .filter(benhNhan -> benhNhan.getCccd().equals(cccd))
                .forEach(System.out::println);
    }

    public void xoaBenhNhanTheoCCCD(String cccd) {
        this.danhSach.removeIf(bnhNhan -> bnhNhan.getCccd().equals(cccd));
        repository.saveToFile(danhSach, FILE_PATH);
    }

    public List<BenhNhan> hienThiDanhSach() {
        return this.danhSach;
    }

    public void sapXepTheoTen() {
        this.danhSach.sort(Comparator.comparing(BenhNhan::getHoTen));
        repository.saveToFile(danhSach, FILE_PATH);
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
