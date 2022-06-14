
package day25_io;

import java.io.BufferedReader;
import java.io.FileReader;


public class BufferReaderDemo {
    public static void main(String[] args) {
        String path = "src/main/java/day24_io/data/news.txt";
        try (FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);) {
            String data = null;
            // 逐行讀取
            while ((data = br.readLine()) != null) {
                System.out.println(data);
                
            }
            
        } catch (Exception e) {
        }
    }
}
