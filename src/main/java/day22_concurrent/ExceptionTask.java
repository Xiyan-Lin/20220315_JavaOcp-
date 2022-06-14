
package day22_concurrent;

import java.util.concurrent.Callable;


public class ExceptionTask implements Callable<Object>{

    

    @Override
    public Object call() throws Exception {
        System.out.println("發生錯誤的Task ");
        throw new RuntimeException("哇哇哇~發生了例外...");   }
    
}
