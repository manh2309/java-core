import model.BenhNhan;
import service.BenhNhanService;
import utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final BenhNhanService service = new BenhNhanService();
    private final FileUtils fileUtils = new FileUtils();

    public void show() throws IOException {
        int choice;
        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Th?m b?nh nh?n");
            System.out.println("2. Hi?n th? danh s?ch");
            System.out.println("3. T?m theo CCCD");
            System.out.println("4. Xo? theo CCCD");
            System.out.println("5. S?p x?p theo t?n");
            System.out.println("6. Ghi ra file JSON");
            System.out.println("7. ??c t? file JSON");
            System.out.println("0. Tho?t");
            System.out.print("Ch?n: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                        BenhNhan benhNhan = service.nhapBenhNhanTuBanPhim();
                        service.addBenhNhan(benhNhan);
                        }
                case 2 -> service.hienThiDanhSach();
                case 3 -> {
                    System.out.print("Nh?p CCCD c?n t?m: ");
                    String cccd = scanner.nextLine();
                    service.timKiemBenhNhanTheoCCCD(cccd);
                }
                case 4 -> {
                    System.out.print("Nh?p CCCD c?n t?m: ");
                    String cccd = scanner.nextLine();
                    service.xoaBenhNhanTheoCCCD(cccd);
                }
                case 5 -> service.sapXepTheoTen();
                case 6 -> {
                    List<BenhNhan> bn = new ArrayList<>();
                    BenhNhan b1 = new BenhNhan();
                    b1.setMaBN("1231");
                    b1.setHoTen("qwe");
                    b1.setNgayDangKy(new Date());
                    b1.setCccd("1231231");
                    bn.add(b1);
                    fileUtils.ghiFile("benhnhan.json", bn);
                }
                case 7 -> {List<BenhNhan> bn = fileUtils.readFile("benhnhan.json");
                    bn.stream().forEach(System.out::println);
                }
                case 0 -> System.out.println("T?m bi?t!");
                default -> System.out.println("L?a ch?n kh?ng h?p l?!");
            }
        } while (choice != 0);
    }
}
