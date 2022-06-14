
package access.bar;


public class Welcome {
    // 存取Hello 的資源
    public void accessHello(){
        Hello hello = new Hello();
        System.out.println(hello.a);
        System.out.println(hello.b);
        System.out.println(hello.c);
        // System.out.println(hello.d); 不可存取 private 方法
    }
}
