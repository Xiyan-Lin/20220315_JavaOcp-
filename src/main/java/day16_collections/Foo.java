
package day16_collections;


// 只能有一個"自定義"的方法要實做
// 不包含 object 方法
// 不包含 default 方法
// 不包含 static 方法
public interface Foo {
    void bar();
    public boolean equals(Object o); //隸屬於物件方法
    default void copyright(){
        System.out.println("版權所有...");
    }
    public static void hello(){
        System.out.println("Helo...");
    }
}
