
package day25_nio;

import java.nio.file.Path;
import java.nio.file.Paths;


public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/day25_nio/PathDemo.java");
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(1, 3): " + path.subpath(1, 3));
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        System.out.println("toUri: " + path.toUri());
        
        
    }
}
