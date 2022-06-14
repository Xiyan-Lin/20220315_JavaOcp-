
package day24_io;

import java.io.File;


public class CreateFile {
    public static void main(String[] args) {
        String path = "src/main/java/day24_io";
        String folderName = "/data";
        String fileName = "/news.txt";
        // 資料夾完整路徑
        String folderPath = path + folderName;
        File file = new File(folderPath);
        if(!file.exists()){
            // 建立目錄
            file.mkdir();
            
        }
        // 檔案完逞路徑
        String fullPath = folderPath + fileName;
        File file2 = new File(fullPath);
        if(!file2.exists()){
            // 建立檔案
            try {
               boolean success = file2.createNewFile();
                System.out.println("檔案建立: " + success);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            
        } else {
            System.out.println(file2 + "已存在");
        }
    }
}
