
package day24_io;

import java.io.File;
import java.io.IOException;


public class CreateTempFile {
    public static void main(String[] args) throws IOException {
        String folderPath = "src/main/java/day24_io/data";
        File file = new File(folderPath);
        System.out.println(file.isDirectory()); // 是否是目錄
        System.out.println(file.isFile()); // 是否是檔案
        if(file.isDirectory()){
            File tmpFile = File.createTempFile("temp", ".txt", file);
            System.out.println(tmpFile + "建立成功");
            //Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe gmail.com" );
        }
        
    }
}
