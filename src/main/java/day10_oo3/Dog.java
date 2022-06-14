
package day10_oo3;

// 介面(規格)
public interface Dog {
    int LEGS = 4; // public static final int LEGS = 4;
                  // public static final 稱為常數(不會變的數, 變數名稱一律大寫)
    void skill(); // public abstract void skill();
    void eat();   // public abstract void eat();
}
