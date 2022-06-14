package day25_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
    public static void main(String[] args) {
        String source = "src/main/java/day25_io/f18.jpg";
        String dest = "src/main/java/day25_io/f18_backup.jpg";
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);) {
            System.out.printf("檔案大小: %d bytes\n", fis.available());
            byte[] buffer = new byte[1];
            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
            System.out.println("Copy 完畢!");
        } catch (Exception e) {
        }
    }
}
