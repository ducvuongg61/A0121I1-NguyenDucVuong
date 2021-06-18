package b16_IO.baitap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        // Source file.
        Path source = Paths.get("D:\\CodeGym\\A0121I1_NguyenDucVuong\\module2\\src\\b16_IO\\baitap\\read.txt");
        // Destination file.
        Path destination = Paths.get("D:\\CodeGym\\A0121I1_NguyenDucVuong\\module2\\src\\b16_IO\\baitap\\demo.txt");
        try {
            copyFile(source, destination);
        } catch (IOException e) {
            System.out.println("Problem occurs when copying files");
            e.printStackTrace();
        }
    }

    public static void copyFile(Path source, Path destination) throws IOException {
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }

}

