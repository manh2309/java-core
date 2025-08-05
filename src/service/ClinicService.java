package service;

import model.Patient;

import java.util.*;

public class ClinicService {

    private Map<String, Patient> patients = new HashMap<>();

    public void addPatient(Patient patient) {
        patients.put(patient.getCccd(), patient);
    }

    public Patient findPatient(String cccd) {
        return patients.get(cccd);
    }

    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients.values());
    }

    public void getAllPatientsV1() {
        List<Patient> patients1 = new ArrayList<>(patients.values());
        patients1.forEach(System.out::println);
    }

    public void xoaPatient(String cccd) {
        patients.remove(cccd);
    }

    public void addPatients(List<Patient> patient) {
        for (Patient p : patient) {
            addPatient(p);
        }
    }

    public Patient nhapBenhNhanTuBanPhim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh?p h? t?n: ");
        String name = sc.nextLine();
        System.out.print("Nh?p CCCD: ");
        String cccd = sc.nextLine();
        System.out.print("Nh?p b?nh l?: ");
        String benhLy = sc.nextLine();
        Date ngayDangKy = new Date(); // m?c ??nh h?m nay

        Patient p = new Patient(benhLy, ngayDangKy);
        p.setName(name);
        p.setCccd(cccd);
        return p;
    }
}
