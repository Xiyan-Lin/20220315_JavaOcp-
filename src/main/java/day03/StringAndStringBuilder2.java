
package day03;

//A. String str2 = str1;
//B. String str2 = new String (str1);
//C. String str2 = sb1. toString ();
//D. String str2 = "Duke";
// 字串考題
public class StringAndStringBuilder2 {
    public static void main(String[] args) {
       StringBuilder sb1 = new StringBuilder("Duke");
       String str1 = sb1.toString(); // not in String pool
       String str2 = str1;
        System.out.println(str1 == str2);
    }
}
