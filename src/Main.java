import model.Patient;
import service.ClinicService;
import service.PatientFileService;
import service.SortByNameDescending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClinicService service = new ClinicService();

        Patient p1 = new Patient("Cam c?m", new Date(124, 6, 29)); // 29/07/2024
        p1.setName("Nguy?n V?n A");
        p1.setCccd("111");
        Patient p2 = new Patient("?au h?ng", new Date(125, 0, 1)); // 01/01/2025
        p2.setName("L? V?n B");
        p2.setCccd("222");

        service.addPatient(p1);
        service.addPatient(p2);

        List<Patient> list = service.getAllPatients();
        System.out.println("--- S?p x?p theo ng?y ??ng k? (m?c ??nh Comparable) ---");
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("--- S?p x?p theo t?n gi?m d?n ---");
        list.sort(new SortByNameDescending());
        list.forEach(System.out::println);

        List<Patient> listPatients = new ArrayList<>();

        // T?o danh s?ch b?nh nh?n
        Patient p3 = new Patient("C?m c?m", new Date());
        p1.setName("Nguy?n V?n A");
        p1.setCccd("123456789");

        listPatients.add(p3);

        PatientFileService fileService = new PatientFileService();
        fileService.savePatients(listPatients);

        // ??c l?i file
        List<Patient> loaded = fileService.loadPatients();
        System.out.println("? Danh s?ch ??c t? file:");
        if (loaded != null) {
            loaded.forEach(System.out::println);
        }
    }
}