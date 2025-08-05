import model.Patient;
import service.ClinicService;
import service.PatientFileService;
import service.SortByNameDescending;

import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ClinicService clinicService = new ClinicService();
    private static final PatientFileService fileService = new PatientFileService();
    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = getChoice();
            handleMenu(choice);
        } while (choice != 0);
    }
    private static void printMenu() {
        System.out.println("\n===== QU?N L? B?NH NH?N =====");
        System.out.println("1. Th?m b?nh nh?n");
        System.out.println("2. Hi?n th? danh s?ch");
        System.out.println("3. T?m theo CCCD");
        System.out.println("4. Xo? theo CCCD");
        System.out.println("5. Ghi ra file");
        System.out.println("6. ??c t? file");
        System.out.println("0. Tho?t");
        System.out.println("============================");
        System.out.print("Ch?n ch?c n?ng: ");
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void handleMenu(int choice) {
        switch (choice) {
            case 1 -> {
                Patient p = clinicService.nhapBenhNhanTuBanPhim();
                clinicService.addPatient(p);
            }
            case 2 -> clinicService.getAllPatientsV1();
            case 3 -> {
                System.out.print("Nh?p CCCD c?n t?m: ");
                String cccd = sc.nextLine();
                Patient p1 = clinicService.findPatient(cccd);
                System.out.println(p1);
            }
            case 4 -> {
                System.out.print("Nh?p CCCD c?n xo?: ");
                String cccd = sc.nextLine();
                clinicService.xoaPatient(cccd);
                System.out.println("Xoa thanh cong");
            }
            case 5 -> fileService.savePatients(clinicService.getAllPatients());
            case 6 -> {
                List<Patient> list = fileService.loadPatients();
                clinicService.addPatients(list);
            }
            case 0 -> System.out.println("?? tho?t ch??ng tr?nh.");
            default -> System.out.println("? L?a ch?n kh?ng h?p l?!");
        }
    }
}