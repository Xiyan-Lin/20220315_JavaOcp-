
package day10_oo3;


public abstract class AbstractCat {
    // 抽象類別中的抽象方法一定要加 abstract 修飾字
    // 另外存取權限可以是 public protected & 預設default權限(不寫)
    public abstract void skill();
    
    public void eat(){
        System.out.println("魚");
    }
        
}
