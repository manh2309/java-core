package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.BenhNhan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class FileUtils {

    public static void ghiFile(String pathFile, List<BenhNhan> benhNhans) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter(pathFile);
        gson.toJson(benhNhans, fw);
        fw.close();
    }

    public static List<BenhNhan> readFile(String pathFile) throws IOException {
        Gson gson = new Gson();
        Reader reader = new FileReader(pathFile);
        Type listType = new TypeToken<List<BenhNhan>>() {}.getType();
        List<BenhNhan> danhSach = gson.fromJson(reader, listType);
        return danhSach;
    }
}
