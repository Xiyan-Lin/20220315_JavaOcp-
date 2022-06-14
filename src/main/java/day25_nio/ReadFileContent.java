
package day25_nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadFileContent {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("src/main/java/day25_nio/ReadFileContent");
        // 1. BufferedReader + FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))){
            br.lines().forEach(System.out::println);
            
        } catch (Exception e) {
        }
        
        // 2. Files.newBufferedReader
        try(BufferedReader reader = Files.newBufferedReader(path)){
            reader.lines().forEach(System.out::println);
        } catch (IOException ex) {
            
        }
        
        // 3. Files.readAllLines (List 集合)
        List<String> content = Files.readAllLines(path);
        content.stream().forEach(System.out::println);
        
        // 4. Files.lines (sream<T>)
        Files.lines(path).forEach(System.out::println);
        
    }
}
