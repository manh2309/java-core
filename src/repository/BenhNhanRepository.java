package repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.BenhNhan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepository {

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
            .create();

    // Ghi danh s?ch v?o file JSON
    public void saveToFile(List<BenhNhan> danhSach, String path) {
        try (FileWriter writer = new FileWriter(path)) {
            gson.toJson(danhSach, writer);
        } catch (IOException e) {
            System.out.println("? L?i khi ghi file: " + e.getMessage());
        }
    }

    // ??c danh s?ch t? file JSON
    public List<BenhNhan> readFromFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<BenhNhan>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println("?? Kh?ng t?m th?y file ho?c l?i khi ??c file, tr? v? danh s?ch r?ng.");
            return new ArrayList<>();
        }
    }
}
