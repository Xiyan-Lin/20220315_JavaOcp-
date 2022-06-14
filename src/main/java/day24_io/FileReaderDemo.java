
package day24_io;

import java.io.FileReader;


public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/java/day24_io/data/news.txt")){
            char[] buffer = new char[1];
            StringBuilder sb = new StringBuilder();
            while(fr.read(buffer) != -1){
                //System.out.println(buffer[0]);
                sb.append(buffer);
            }
            System.out.println(sb);
        } catch (Exception e) {
        }
    }
}
