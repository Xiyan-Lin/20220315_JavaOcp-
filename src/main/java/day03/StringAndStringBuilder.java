
package day03;

// 字串
public class StringAndStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        add(sb);
        System.out.println(sb);
        
        String str = "Java";
        add(str);
        System.out.println(str);
        str = add2(str);
        System.out.println(str);
    }
    
    public static String add2(String str) {
        str = str.concat("11");
        return str;
    }
    
    public static void add(String str) {
        str = str.concat("11");
    }
    
    public static void add(StringBuilder sb) {
       sb.append("11");
    }
}
