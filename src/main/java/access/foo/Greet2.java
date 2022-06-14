
package access.foo;

import access.bar.Hello;


public class Greet2 extends Hello{
    // 存取Hello 的資源
    public void accessHello(){
        Greet2 hello = new Greet2();
        System.out.println(hello.a);
        System.out.println(hello.b);  //不可呼叫 protected 方法
        //System.out.println(hello.c);  //不可呼叫 default 方法
        //System.out.println(hello.d); //不可呼叫 private 方法
}
}
