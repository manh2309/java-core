package service;

import model.Patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
