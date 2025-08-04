package service;

import model.Patient;

import java.io.*;
import java.util.List;

public class PatientFileService {

    private final String FILE_PATH = "patients.dat";

    public void savePatients(List<Patient> patients) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(patients);
            System.out.println("? ?? ghi file th?nh c?ng");
        } catch (IOException e) {
            System.err.println("? L?i khi ghi file: " + e.getMessage());
        }
    }

    public List<Patient> loadPatients() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Patient>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("? L?i khi ??c file: " + e.getMessage());
            return null;
        }
    }
}
