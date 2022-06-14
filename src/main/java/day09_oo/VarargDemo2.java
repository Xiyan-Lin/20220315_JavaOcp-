
package day09_oo;

// 自動變長參數若與一般方法產生衝突的調用規則
// 會先滿足一般方法
public class VarargDemo2 {
    public static void main(String[] args) {
        print("John");
        print("John","Mary");
        //print("John","Mary","Helen");
        String[] names = {"John","Mary"};
        print(names);
        print("John", names);
    }
    
    public static void print(String name){ //一般方法
        System.out.println("A");
    }
    
    public static void print(String name1, String name2){ //一般方法
        System.out.println("B");
    }
    
    public static void print(String... names){
        System.out.println("C");
    }
    
    public static void print(String name, String... names){
        System.out.println("D");
    }
    
}
