
package day24_io;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo1 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/main/java/day24_io/data/news.txt");
            fw.append("Hello Java");
            fw.append("\n");
            fw.append("Hello Java 網頁");
            System.out.println("寫入完畢 !");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if( fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        
    }
}
