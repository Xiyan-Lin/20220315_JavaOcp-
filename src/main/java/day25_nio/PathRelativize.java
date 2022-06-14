
package day25_nio;

// 路徑切換

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativize {
    public static void main(String[] args) {
        Path p1 = Paths.get("home");
        Path p2 = Paths.get("home/foo/bar");
        Path p1_to_p2 = p1.relativize(p2);
        System.out.println(p1_to_p2);
        
        Path p2_to_p1 = p2.relativize(p1);
        System.out.println(p2_to_p1);
    }
    
    
}
