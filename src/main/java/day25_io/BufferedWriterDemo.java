
package day25_io;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class BufferedWriterDemo {
    public static void main(String[] args) {
        String dest = "src/main/java/day25_io/demo.txt";
        // 將陣列資料寫入到檔案 demo.txt 中
        String[] rows = {"Java", "11", "爪哇"};
        try (FileWriter fr = new FileWriter(dest);
            BufferedWriter bw = new BufferedWriter(fr, 8*1024)){
            
            for(String row : rows){
                bw.write(row);
                bw.newLine();
            }
            System.out.println("寫入完畢");
        } catch (Exception e) {
        }
    
    
    
    }
}
